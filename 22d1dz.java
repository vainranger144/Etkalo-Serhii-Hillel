import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class FrameAndFooterTests {
    private WebDriver driver;
    private WebDriverWait wait;
    private static final String BASE_URL = "https://guest:welcome2qauto@qauto.forstudy.space/";

    @BeforeClass
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    @Test(priority = 1)
    public void testVideoFrameTitle() {
        driver.get(BASE_URL);

        // Знаходимо YouTube відео
        WebElement iframe = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//iframe[contains(@src, 'youtube')]")));
        driver.switchTo().frame(iframe);

        // Отримуємо title 
        String actualTitle = driver.getTitle(); 
        System.out.println("Frame title: " + actualTitle);

        try {
            Assert.assertEquals(actualTitle, "Hillel IT School | Учись ради мечты! - YouTube", "Title doesn’t equals to the expected result");
        } catch (AssertionError e) {
            System.err.println(e.getMessage());
            throw e;
        } finally {
            driver.switchTo().defaultContent(); // повертаємося до основного контенту
        }
    }

    @Test(priority = 2)
    public void testFooterSocialIcons() {
        driver.get(BASE_URL);

        // Прокручуємо до футера
        WebElement footer = wait.until(ExpectedConditions.presenceOfElementLocated(By.tagName("footer")));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", footer);

        // Знаходимо всі іконки соцмереж
        List<WebElement> icons = footer.findElements(By.xpath(".//a[contains(@href,'http')]"));
        int iconsCount = icons.size();
        Assert.assertEquals(iconsCount, 5, "Social network block doesn’t contain 5 items");

        // Зберігаємо поточну вкладку
        String mainTab = driver.getWindowHandle();

        for (WebElement icon : icons) {
            String href = icon.getAttribute("href");

            // Відкриваємо посилання в новій вкладці
            ((JavascriptExecutor) driver).executeScript("window.open(arguments[0], '_blank');", href);
            wait.until(driver -> driver.getWindowHandles().size() > 1);

            // Перемикаємося на нову вкладку
            List<String> tabs = new ArrayList<>(driver.getWindowHandles());
            String newTab = tabs.stream().filter(t -> !t.equals(mainTab)).findFirst().orElseThrow();

            driver.switchTo().window(newTab);
            String currentUrl = driver.getCurrentUrl();

            System.out.println("Opened URL: " + currentUrl);
            Assert.assertTrue(currentUrl.startsWith("https://"), "Incorrect url of Social network");

            driver.close(); 
            driver.switchTo().window(mainTab); 
        }
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}

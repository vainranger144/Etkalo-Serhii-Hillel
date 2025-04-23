import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class TestLogoAndSignUpButton {
    private WebDriver driver;
    private WebDriverWait wait;
    private static final String BASE_URL = " https://guest:welcome2qauto@qauto.forstudy.space/";

    @BeforeClass
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    @Test(priority = 1)
    public void testLogoDisplayed() {
        driver.get(BASE_URL);
        WebElement logo = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.cssSelector("svg[viewBox*='30']")));
        Assert.assertTrue(logo.isDisplayed(), "Logo is not displayed");
    }

    @Test(priority = 2)
    public void testSignUpButtonBackgroundColor() {
        driver.get(BASE_URL);

        WebElement signUpButton = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//button[contains(@class, 'btn-primary')]")
        ));
        String bgColor = signUpButton.getCssValue("background-color");

        // Преобразование "rgb(r, g, b)" в hex
        String[] rgb = bgColor.replace("rgba(", "").replace("rgb(", "").replace(")", "").split(",");
        int r = Integer.parseInt(rgb[0].trim());
        int g = Integer.parseInt(rgb[1].trim());
        int b = Integer.parseInt(rgb[2].trim());
        String hexColor = String.format("#%02x%02x%02x", r, g, b);

        Assert.assertEquals(hexColor, "#0275d8", "Background color of Sign up button is incorrect");
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}

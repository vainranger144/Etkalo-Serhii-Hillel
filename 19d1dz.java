import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class LogoDisplayTest {
    private WebDriver driver;
    private String baseUrl = "https://guest:welcome2qauto@qauto.forstudy.space/";

    @Before
    public void setUp() {
        driver = new ChromeDriver();
    }

    // Тест-кейс 1: Перевірка відображення логотипу
    @Test
    public void testLogoDisplay() {
        driver.get(baseUrl);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        try {
            // Пошук логотипу.
            WebElement logo = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("svg[viewBox$='30']")));
            if (logo.isDisplayed()) {
                System.out.println("Logo displayed");
            } else {
                System.out.println("Logo does not displayed");
            }
        } catch (Exception e) {
            System.out.println("Logo does not displayed");
        }
    }

    // Тест-кейс 2: Перевірка кольору фону кнопки "Sign up"
    @Test
    public void testSignUpButtonBackgroundColor() {
        driver.get(baseUrl);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        // Шукаємо кнопку "Sign up" за текстом
        WebElement signUpButton = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//button[normalize-space()='Sign up']")
        ));
        // Отримуємо значення CSS-властивості background-color
        String bgColor = signUpButton.getCssValue("background-color");

        if (bgColor.equals("rgba(2, 117, 216, 1)") || bgColor.equals("rgb(2, 117, 216)")) {
            System.out.println("Background color of Sign up button is correct");
        } else {
            System.out.println("Background color of Sign up button is incorrect");
        }
    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}


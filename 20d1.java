import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GuestLoginTest {

    private WebDriver driver;
    private WebDriverWait wait;

    @Before
    public void setUp() {
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.manage().window().maximize();
        System.out.println("=== Тест почався ===");
    }

    @Test
    public void testGuestLoginWithJSAndWaits() {
        try {
            // 1. Відкрити сторінку
            driver.get("https://guest:welcome2qauto@qauto.forstudy.space/");
            wait.until(ExpectedConditions.presenceOfElementLocated(By.tagName("body")));
            System.out.println("[✔] Сторінка завантажена");

            // 2. Очікування тайтла
            wait.until(ExpectedConditions.titleIs("Hillel Qauto"));
            assertEquals("Hillel Qauto", driver.getTitle());
            System.out.println("[✔] Тайтл відповідає 'Hillel Qauto'");

            // 3. Клік через JavaScript
            WebElement guestLoginButton = wait.until(
                    ExpectedConditions.presenceOfElementLocated(By.xpath("//button[contains(text(), 'Guest log in')]"))
            );
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", guestLoginButton);
            System.out.println("[✔] Клік на 'Guest log in' через JavaScript виконано");

            // 4. Очікування кнопки Add car
            WebElement addCarButton = wait.until(
                    ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(), 'Add car')]"))
            );
            assertTrue(addCarButton.isDisplayed() && addCarButton.isEnabled());
            System.out.println("[✔] Кнопка 'Add car' активна та доступна для кліку");

            System.out.println("===  Усі кроки тесту виконано успішно ===");
        } catch (Exception e) {
            System.err.println("===  Помилка під час виконання тесту: " + e.getMessage() + " ===");
            throw e; // кинути далі, щоб JUnit міг відмітити тест як failed
        }
    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
        System.out.println("=== Тест завершено ===");
    }
}

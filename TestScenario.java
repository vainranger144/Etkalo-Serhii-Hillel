import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;

public class TestScenario {
    public static void main(String[] args) {

       
        WebDriver driver = new ChromeDriver();

        try {
            // Открывает браузер в полном экране
            driver.manage().window().maximize();

            // Переход на указанный сайт с базовой аутентификацией (guest / welcome2qauto)
            driver.get("https://guest:welcome2qauto@qauto.forstudy.space/");

            // Нахождение кнопки "Guest log in" с помощью XPath и клик по ней
            WebElement guestLoginButton = driver.findElement(By.xpath("//button[text()='Guest log in']"));
            guestLoginButton.click();

            // Задержка для уверенности, что страница успела загрузиться
            Thread.sleep(2000);

            // Поиск элементов border menu через CSS-селектор
            List<WebElement> borderMenuItems = driver.findElements(By.cssSelector("ul.border-menu li"));

            // Проверка, если элементы находятся и вывод их текста в консоль
            for (WebElement menuItem : borderMenuItems) {
                System.out.println(menuItem.getText());
            }

        } catch (Exception e) {
            // Вывод информации об ошибке в случае проблемы
            e.printStackTrace();
        } finally {
            // Закрытие браузера
            driver.quit();
        }
    }
}  

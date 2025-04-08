import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CalculatorTest {

    private Calculator calculator;

    // Метод, який виконується перед усіма тестами (ініціалізація ресурсу)
    @BeforeClass
    public void setUp() {
        calculator = new Calculator();
        System.out.println("Calculator створений");
    }

    // Метод, який виконується після усіх тестів (звільнення ресурсу)
    @AfterClass
    public void tearDown() {
        calculator = null;
        System.out.println("Calculator звільнений");
    }

    // Тест методу додавання
    @Test(description = "Тест додавання двох чисел", priority = 1)
    public void testAddition() {
        double a = 10;
        double b = 5;
        double result = calculator.add(a, b);
        System.out.println("Додавання: " + a + " + " + b + " = " + result);
        // Перевірка: 10 + 5 = 15
        Assert.assertEquals(result, 15.0);
    }

    // Тест методу віднімання
    @Test(description = "Тест віднімання двох чисел", priority = 2)
    public void testSubtraction() {
        double a = 10;
        double b = 5;
        double result = calculator.subtract(a, b);
        System.out.println("Віднімання: " + a + " - " + b + " = " + result);
        // Перевірка: 10 - 5 = 5
        Assert.assertEquals(result, 5.0);
    }

    // Тест методу множення
    @Test(description = "Тест множення двох чисел", priority = 3)
    public void testMultiplication() {
        double a = 10;
        double b = 5;
        double result = calculator.multiply(a, b);
        System.out.println("Множення: " + a + " * " + b + " = " + result);
        // Перевірка: 10 * 5 = 50
        Assert.assertEquals(result, 50.0);
    }

    // Тест методу ділення
    @Test(description = "Тест ділення двох чисел", priority = 4)
    public void testDivision() {
        double a = 10;
        double b = 5;
        double result = calculator.divide(a, b);
        System.out.println("Ділення: " + a + " / " + b + " = " + result);
        // Перевірка: 10 / 5 = 2
        Assert.assertEquals(result, 2.0);
    }

    // Тест обробки виключення при діленні на нуль
    @Test(description = "Тест обробки ділення на нуль, очікується ArithmeticException", 
          priority = 5, expectedExceptions = ArithmeticException.class)
    public void testDivisionByZero() {
        double a = 10;
        double b = 0;
        System.out.println("Спроба ділення " + a + " / " + b);
        // В цьому виклику має виникнути ArithmeticException
        calculator.divide(a, b);
    }
}

public class Calculator {

    // Метод додавання
    public double add(double a, double b) {
        return a + b;
    }
    
    // Метод віднімання
    public double subtract(double a, double b) {
        return a - b;
    }
    
    // Метод множення
    public double multiply(double a, double b) {
        return a * b;
    }
    
    // Метод ділення
    // Якщо b == 0, викидаємо ArithmeticException
    public double divide(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Ділення на нуль неможливе!");
        }
        return a / b;
    }
}

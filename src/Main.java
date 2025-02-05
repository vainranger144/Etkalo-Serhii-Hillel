import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static int square(int number) {
        return number * number;
    }

    public static double cylinderVolume(double radius, double height) {
        return 3.14159 * radius * radius * height;
    }

    public static int power(int a, int b) {
        int result = 1;
        for (int i = 0; i < b; i++) {
            result *= a;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US); // Устанавливаем точку как разделитель

        System.out.print("Введіть ціле число: ");
        int number = scanner.nextInt();
        System.out.println("Квадрат числа " + number + " дорівнює " + square(number) + ".");

        System.out.print("Введіть радіус: ");
        double radius = scanner.nextDouble();
        System.out.print("Введіть висоту: ");
        double height = scanner.nextDouble();
        System.out.println("Об'єм циліндра: " + cylinderVolume(radius, height));

        System.out.print("Введіть a: ");
        int a = scanner.nextInt();
        System.out.print("Введіть b: ");
        int b = scanner.nextInt();
        System.out.println("Результат: " + power(a, b));
    }
}

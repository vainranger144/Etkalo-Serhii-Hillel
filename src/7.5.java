import java.util.Scanner;

public class XYZChecker {
    public static boolean xyzThere(String str) {
        return str.matches(".*(^|[^.])xyz.*");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть рядок: ");
        String input = scanner.nextLine();

        boolean result = xyzThere(input);
        System.out.println("Результат: " + result);

        scanner.close();
    }
}

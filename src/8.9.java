import java.util.Scanner;

public class StringUtil {
    public static boolean endsWith(String str1, String str2) {
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        return str1.endsWith(str2) || str2.endsWith(str1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть перший рядок: ");
        String str1 = scanner.nextLine();

        System.out.print("Введіть другий рядок: ");
        String str2 = scanner.nextLine();

        boolean result = endsWith(str1, str2);
        System.out.println("Результат: " + result);

        scanner.close();
    }
}

import java.util.Scanner;

public class DoubleChars {
    public static String doubleChars(String str) {
        StringBuilder result = new StringBuilder();
        for (char ch : str.toCharArray()) {
            result.append(ch).append(ch);
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть рядок: ");
        String input = scanner.nextLine();

        String result = doubleChars(input);
        System.out.println("Результат: " + result);

        scanner.close();
    }
}

import java.util.Scanner;

public class MixString {
    public static String mixString(String a, String b) {
        StringBuilder result = new StringBuilder();
        int minLength = Math.min(a.length(), b.length());

        // Чередуем символы из обоих строк
        for (int i = 0; i < minLength; i++) {
            result.append(a.charAt(i)).append(b.charAt(i));
        }

        // Добавляем оставшиеся символы, если строки разной длины
        result.append(a.substring(minLength)).append(b.substring(minLength));

        return result.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первую строку: ");
        String str1 = scanner.nextLine();

        System.out.print("Введите вторую строку: ");
        String str2 = scanner.nextLine();

        System.out.println("Результат: " + mixString(str1, str2));

        scanner.close();
    }
}

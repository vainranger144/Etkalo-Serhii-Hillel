import java.util.Scanner;

public class CodeCounter {
    public static int countCode(String str) {
        int count = 0;
        for (int i = 0; i < str.length() - 3; i++) {
            if (str.startsWith("co", i) && str.charAt(i + 3) == 'e') {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть рядок: ");
        String input = scanner.nextLine();

        int result = countCode(input);
        System.out.println("Кількість входжень: " + result);

        scanner.close();
    }
}

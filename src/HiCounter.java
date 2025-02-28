import java.util.Scanner;

public class HiCounter {
    public static int countHi(String str) {
        int count = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.substring(i, i + 2).equals("hi")) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть рядок: ");
        String input = scanner.nextLine();

        int result = countHi(input);
        System.out.println("Кількість входжень 'hi': " + result);

        scanner.close();
    }
}

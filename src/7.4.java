import java.util.Scanner;

public class ZipZapRemover {
    public static String zipZap(String str) {
        return str.replaceAll("z.p", "zp");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть рядок: ");
        String input = scanner.nextLine();

        String result = zipZap(input);
        System.out.println("Результат: " + result);

        scanner.close();
    }
}

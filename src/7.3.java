import java.util.Scanner;

public class XYZMiddleChecker {
    public static boolean xyzMiddle(String str) {
        int index = str.indexOf("xyz");

        while (index != -1) {
            int left = index;
            int right = str.length() - (index + 3); // 3 - довжина "xyz"

            if (Math.abs(left - right) <= 1) {
                return true;
            }

            index = str.indexOf("xyz", index + 1);
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть рядок: ");
        String input = scanner.nextLine();

        boolean result = xyzMiddle(input);
        System.out.println("Чи знаходиться 'xyz' у середині рядка? " + result);

        scanner.close();
    }
}

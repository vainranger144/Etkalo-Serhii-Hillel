import java.util.Scanner;

public class dz81 {
    public static void main(String[] args) {
        System.out.println("Введите строку:");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        int catCount = countOccurrences(s, "cat");
        int dogCount = countOccurrences(s, "dog");

        if (catCount == dogCount) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }

    public static int countOccurrences(String str, String sub) {
        int count = 0;
        int index = str.indexOf(sub);

        while (index != -1) {
            count++;
            index = str.indexOf(sub, index + sub.length());
        }

        return count;
    }
}

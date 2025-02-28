import java.util.Scanner;

public class CountEvenInts {
    public static int countEvenInts(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (num % 2 == 0) { // Перевірка на парність
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть розмір масиву: ");
        int size = scanner.nextInt();

        int[] nums = new int[size];
        System.out.println("Введіть елементи масиву:");
        for (int i = 0; i < size; i++) {
            nums[i] = scanner.nextInt();
        }

        int result = countEvenInts(nums);
        System.out.println("Кількість парних чисел у масиві: " + result);

        scanner.close();
    }
}

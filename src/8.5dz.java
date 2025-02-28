import java.util.Scanner;

public class ArrayDifference {
    public static int differenceLargestSmallest(int[] nums) {
        int min = nums[0];
        int max = nums[0];

        for (int num : nums) {
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        return max - min;
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

        int result = differenceLargestSmallest(nums);
        System.out.println("Різниця між найбільшим і найменшим значеннями: " + result);

        scanner.close();
    }
}

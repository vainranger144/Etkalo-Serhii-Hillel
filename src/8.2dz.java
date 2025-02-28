import java.util.Arrays;
import java.util.Scanner;

public class CenteredAverage {
    public static int centeredAverage(int[] nums) {
        Arrays.sort(nums); // Сортуємо масив
        int sum = 0;
        
       
        for (int i = 1; i < nums.length - 1; i++) {
            sum += nums[i];
        }

        
        return sum / (nums.length - 2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть розмір масиву (мінімум 3): ");
        int size = scanner.nextInt();
        while (size < 3) {
            System.out.print("Розмір має бути 3 або більше. Введіть знову: ");
            size = scanner.nextInt();
        }

        int[] nums = new int[size];
        System.out.println("Введіть елементи масиву:");
        for (int i = 0; i < size; i++) {
            nums[i] = scanner.nextInt();
        }

        int result = centeredAverage(nums);
        System.out.println("Центроване середнє: " + result);

        scanner.close();
    }
}

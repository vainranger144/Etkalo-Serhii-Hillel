import java.util.Scanner;

public class UnluckySum {
    public static int sumWithoutUnlucky13(int[] nums) {
        int sum = 0;
        boolean skipNext = false;

        for (int num : nums) {
            if (num == 13) {
                skipNext = true; // Пропускаємо наступне число
            } else if (skipNext) {
                skipNext = false; // Пропускаємо поточне число після 13
            } else {
                sum += num; // Додаємо до суми, якщо це не 13 і не число після нього
            }
        }

        return sum;
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

        int result = sumWithoutUnlucky13(nums);
        System.out.println("Сума без 13 та чисел після нього: " + result);

        scanner.close();
    }
}

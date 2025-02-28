import java.util.Scanner;

public class SumIgnoreSections {
    public static int sumIgnoreSections(int[] nums) {
        int sum = 0;
        boolean ignore = false;

        for (int num : nums) {
            if (num == 6) {
                ignore = true; // Починаємо ігнорувати числа
            } else if (num == 7 && ignore) {
                ignore = false; // Закінчуємо ігнорування
            } else if (!ignore) {
                sum += num; // Додаємо тільки якщо не в режимі ігнорування
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

        int result = sumIgnoreSections(nums);
        System.out.println("Сума без ділянок між 6 і 7: " + result);

        scanner.close();
    }
}

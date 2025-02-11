import java.util.Scanner;

public class ArrayOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть кількість елементів масиву: ");
        int n = scanner.nextInt();
        int[] array = new int[n];

        System.out.println("Введіть елементи масиву:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }


        double average = calculateAverage(array);
        System.out.println("Среднее арифметическое: " + average);


        int min = findMin(array);
        System.out.println("Минимальное значение: " + min);


        int max = findMax(array);
        System.out.println("Максимальное значение: " + max);


        System.out.print("Введіть число, яке потрібно знайти в масиві: ");
        int numberToFind = scanner.nextInt();

        boolean isPresent = isNumberPresent(array, numberToFind);
        if (isPresent) {
            System.out.println("Число " + numberToFind + " знайдено в масиві.");
        } else {
            System.out.println("Число " + numberToFind + " не знайдено в масиві.");
        }
    }


    public static double calculateAverage(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return (double) sum / array.length;
    }


    public static int findMin(int[] array) {
        int min = array[0];
        for (int num : array) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }


    public static int findMax(int[] array) {
        int max = array[0];
        for (int num : array) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }


    public static boolean isNumberPresent(int[] array, int number) {
        for (int num : array) {
            if (num == number) {
                return true;
            }
        }
        return false;
    }
}

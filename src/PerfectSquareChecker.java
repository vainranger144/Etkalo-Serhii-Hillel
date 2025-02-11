public class PerfectSquareChecker {
    public static boolean isPerfectSquare(int num) {
        if (num < 0) return false;
        int sqrt = (int) Math.sqrt(num);
        return sqrt * sqrt == num;
    }

    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Введіть ціле число: ");
        int num = scanner.nextInt();
        scanner.close();

        if (isPerfectSquare(num)) {
            System.out.println(num + " є квадратом цілого числа.");
        } else {
            System.out.println(num + " не є квадратом цілого числа.");
        }
    }
}

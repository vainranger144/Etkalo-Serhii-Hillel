public class SumCalculator {
    public static String calculateSumUpToN(int n) {
        if (n <= 0) return "Хибні вхідні параметри";

        StringBuilder result = new StringBuilder();
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            result.append(i).append(" ");
            sum += i;
        }

        return result.toString().trim();
    }

    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Введіть число N: ");
        int n = scanner.nextInt();
        scanner.close();

        System.out.println(calculateSumUpToN(n));
    }
}

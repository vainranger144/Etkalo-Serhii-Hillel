public class PrimeChecker {
    public static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPrime(0)); // false
        System.out.println(isPrime(8)); // false
        System.out.println(isPrime(7)); // true
    }
}

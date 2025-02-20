import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 

        System.out.println("Введите слово и число n через пробел:");
        String str = sc.next();
        int n = sc.nextInt();

        System.out.println(str.substring(str.length() - n));
        sc.close();
    }
    public static String repeatEnd(String str, int n) {
        String end = str.substring(str.length() - n); 
        return end.repeat(n); // Повторяем n раз 
    }

}

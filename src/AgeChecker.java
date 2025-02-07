public class AgeChecker {
    public static String checkAge(int age) {
        if (age >= 18) {
            return "Ви доросла особа";
        } else {
            return "Ви не є дорослою особою";
        }
    }

    public static void main(String[] args) {
        System.out.println(checkAge(18)); // Ви доросла особа
        System.out.println(checkAge(0));  // Ви не є дорослою особою
        System.out.println(checkAge(99)); // Ви доросла особа
    }
}

public class StudentGrade {
    public static String getGrade(int score) {
        switch (score) {
            case 5: return "Відмінно";
            case 4: return "Добре";
            case 3: return "Задовільно";
            case 2: return "Незадовільно";
            case 1: return "Погано";
            default: return "Неправильна оцінка";
        }
    }

    public static void main(String[] args) {
        System.out.println(getGrade(5)); // "Відмінно"
        System.out.println(getGrade(1)); // "Погано"
        System.out.println(getGrade(-3)); // "Неправильна оцінка"
    }
}

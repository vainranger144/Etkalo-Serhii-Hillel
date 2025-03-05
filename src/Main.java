import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Олег", 22, PersonRole.DOCTOR, Person.MALE);
        person1.display();

        Person person2 = new Person("Віка", 23, PersonRole.OTHER, Person.FEMALE);
        person2.display();

        // Введення ролі через консоль
        System.out.println("Введіть нову роль для " + person2.getName() + " (STUDENT, TEACHER, DOCTOR, ENGINEER, ARTIST, OTHER):");
        Scanner sc = new Scanner(System.in);
        String inputRole = sc.nextLine();

        // Перевірка, чи введена роль є допустимою
        PersonRole newRole = PersonRole.OTHER; // Значення за замовчуванням
        if (inputRole.equals("STUDENT") || inputRole.equals("TEACHER") || inputRole.equals("DOCTOR") ||
                inputRole.equals("ENGINEER") || inputRole.equals("ARTIST")) {
            newRole = PersonRole.valueOf(inputRole);
        } else {
            System.out.println("Невірний ввід, роль встановлена як OTHER.");
        }

        person2.setRole(newRole);
        person2.display();

        Person person3 = new Person("Коля", 23, PersonRole.ENGINEER, Person.MALE);
        person3.display();

        sc.close();
    }
}

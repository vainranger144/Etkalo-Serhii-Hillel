import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Олег", 22, PersonRole.DOCTOR, Person.MALE);
        person1.display();

        Person person2 = new Person("Віка", 23, PersonRole.OTHER, Person.FEMALE);
        person2.display();

        // Зміна ролі для person2 через введення користувача
        System.out.println("Введіть нову роль для " + person2.getName() + " (STUDENT, TEACHER, DOCTOR, ENGINEER, ARTIST, OTHER):");
        Scanner sc = new Scanner(System.in);
        String inputRole = sc.nextLine().toUpperCase();
        PersonRole newRole;
        try {
            newRole = PersonRole.valueOf(inputRole);
        } catch (IllegalArgumentException e) {
            System.out.println("Невірний ввід, роль встановлена як OTHER.");
            newRole = PersonRole.OTHER;
        }
        person2.setRole(newRole);
        person2.display();

        Person person3 = new Person("Коля", 23, PersonRole.ENGINEER, Person.MALE);
        person3.display();

        sc.close();
    }
}

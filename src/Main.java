import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Man("Олег", 22, PersonRole.DOCTOR);
        person1.display();

        Person person2 = new Woman("Віка", 23, PersonRole.OTHER);
        person2.display();

        System.out.println("Введіть нову роль для " + person2.getName() + " (STUDENT, TEACHER, DOCTOR, ENGINEER, ARTIST, OTHER):");
        Scanner sc = new Scanner(System.in);
        String inputRole = sc.nextLine();

        PersonRole newRole = PersonRole.OTHER;
        try {
            newRole = PersonRole.valueOf(inputRole);
        } catch (IllegalArgumentException e) {
            System.out.println("Невірний ввід, роль встановлена як OTHER.");
        }

        person2.setRole(newRole);
        person2.display();

        Person person3 = new Man("Коля", 23, PersonRole.ENGINEER);
        person3.display();

        sc.close();
    }
}

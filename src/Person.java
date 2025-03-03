
import java.util.Scanner;

public class Person {
    private String name;
    private int age;
    private String profession;

    public Person(String name, int age, String profession) {
        this.name = name;
        this.age = age;
        this.profession = profession;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public String getProfession() {
        return this.profession;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Вік має бути позитивним!");
        }

    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public void display() {
        System.out.println("Ім'я: " + this.name + ", Вік: " + this.age + ",Профессія:" + this.profession);
    }

    public void newProfession() {
        System.out.println("Введіть нову професію:");
        Scanner sc = new Scanner(System.in);
        String newProfession = sc.nextLine();
        sc.close();
        if (newProfession.equalsIgnoreCase("немає")) {
            System.out.println("Ім'я: " + this.name + ", Вік: " + this.age + ", Професія: " + this.profession);
        } else {
            this.profession = newProfession;
            System.out.println("Ім'я: " + this.name + ", Вік: " + this.age + ", Нова професія: " + this.profession);
        }

    }
}

public class Person implements Displayable {
    private String name;
    private int age;
    private PersonRole role; // Використовуємо enum для ролі
    private String gender;

    public static final String MALE = "чоловік";
    public static final String FEMALE = "жінка";

    public Person(String name, int age, PersonRole role, String gender) {
        this.name = name;
        this.age = age;
        this.role = role;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public PersonRole getRole() {
        return role;
    }

    public String getGender() {
        return gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        }
    }

    public void setRole(PersonRole role) {
        this.role = role;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void display() {
        System.out.println("Ім'я: " + name + ", Вік: " + age +
                ", Роль: " + role +
                ", Стать: " + gender);
    }

    @Override
    public void displayInformation() {

    }
}

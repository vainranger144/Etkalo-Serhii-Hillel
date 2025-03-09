public abstract class Person implements Displayable {
    protected String name;
    protected int age;
    protected PersonRole role;
    protected String gender;

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

    // Абстрактный метод для отображения информации
    public abstract void display();

    // Перегруженный метод интерфейса Displayable
    public void displayInformation() {
        System.out.println("Ім'я: " + name + ", Вік: " + age + ", Роль: " + role + ", Стать: " + gender);
    }
}

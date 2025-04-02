public abstract class Person implements Displayable {
    protected String name;
    protected int age;
    protected PersonRole role;
    protected String gender;

    public Person(String name, int age, PersonRole role, String gender) throws InvalidUserDataException {
        if (name == null || name.trim().isEmpty()) {
            throw new InvalidUserDataException("Ім'я не може бути порожнім.");
        }
        if (age <= 0) {
            throw new InvalidUserDataException("Вік повинен бути більше нуля.");
        }
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

    public void setName(String name) throws InvalidUserDataException {
        if (name == null || name.trim().isEmpty()) {
            throw new InvalidUserDataException("Ім'я не може бути порожнім.");
        }
        this.name = name;
    }

    public void setAge(int age) throws InvalidUserDataException {
        if (age <= 0) {
            throw new InvalidUserDataException("Вік повинен бути більше нуля.");
        }
        this.age = age;
    }

    public void setRole(PersonRole role) {
        this.role = role;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

  
    public abstract void display();

   
    public void displayInformation() {
        System.out.println("Ім'я: " + name + ", Вік: " + age + ", Роль: " + role + ", Стать: " + gender);
    }
}

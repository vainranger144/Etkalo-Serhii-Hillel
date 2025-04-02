public class Man extends Person {
    public Man(String name, int age, PersonRole role) throws InvalidUserDataException {
        super(name, age, role, "чоловік");
    }

    @Override
    public void display() {
        System.out.println("Чоловік: " + name + ", Вік: " + age + ", Роль: " + role);
    }
}

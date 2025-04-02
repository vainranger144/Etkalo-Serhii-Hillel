public class Woman extends Person {
    public Woman(String name, int age, PersonRole role) throws InvalidUserDataException {
        super(name, age, role, "жінка");
    }

    @Override
    public void display() {
        System.out.println("Жінка: " + name + ", Вік: " + age + ", Роль: " + role);
    }
}

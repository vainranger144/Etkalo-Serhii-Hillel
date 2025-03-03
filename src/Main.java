//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Person person1 = new Person("Олег", 22, "Лікар");
        person1.display();
        Person person2 = new Person("Віка", 23, "Фармацевт");
        person2.display();
        person2.newProfession();
        Person person3 = new Person("Коля", 23, "Водій");
        person3.display();
    }
}

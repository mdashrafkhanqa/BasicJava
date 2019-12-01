package polymorphism;

public class dynamicPolymorphism {

    public static void main(String[] args) {

        Person person = new Person();
        person.display();

        person = new Teacher();
        person.display();

        person = new Student();
        person.display();
    }
}

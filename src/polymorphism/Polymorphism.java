package polymorphism;

public class Polymorphism {

    /* Poly means many or multiple and morph means form or behavior so polymorphism
    means many forms. Polymorphism is a OOPs concept where one name can have many forms. */

    public static void main(String[] args) {

        Person person = new Person();
        Teacher teacher = new Teacher();
        Student student = new Student();

        person.display();
        teacher.display();
        student.display();
    }
}

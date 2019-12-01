package encapsulation;

public class Encapsulation {

    /* "Encapsulation is a process of packaging variables and methods into a single unit,
       and protecting data by declaring them as private."

       Private data will be hidden from other classes and they can only be accessed through
       the methods of their current class, this is known as data hiding. */

    public static void main(String[] args) {
        Person Obj = new Person();
        Obj.setName("Anis");
        System.out.println(Obj.getName());
        Obj.age = 30;
        System.out.println(Obj.age);
        Obj.talk();
    }
}

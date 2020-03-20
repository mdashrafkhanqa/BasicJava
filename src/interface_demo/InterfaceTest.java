package interface_demo;

public class InterfaceTest {

    /* An interface in Java, is a collection of abstract methods.
       An interface is just like Java Class, but it only has static constants and
       abstract method. Java uses interface to implement multiple inheritance. A Java
       class can implement multiple Java Interfaces. All methods in an interface are
       implicitly public and abstract. */

    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.eat();

        Cat cat = new Cat();
        cat.eat();
    }
}

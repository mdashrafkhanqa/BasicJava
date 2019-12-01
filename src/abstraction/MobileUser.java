package abstraction;

public abstract class MobileUser {

    void call(){ // non abstract method
        System.out.println("call method");
    }

    abstract void sendMessage(); // abstract method

}

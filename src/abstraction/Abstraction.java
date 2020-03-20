package abstraction;

public class Abstraction {

    /* Abstraction is the process of hiding the implementation details and showing
       only the functionality to the user. */

    public static void main(String[] args) {

        MobileUser mu; //Reference Variable

        mu = new Ashraf();
        mu.call();
        mu.sendMessage();

        mu = new Bonny();
        mu.sendMessage();
    }
}

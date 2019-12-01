package abstraction;

public class Abstraction {

    public static void main(String[] args) {

        MobileUser mu; //Reference Variable

        mu = new Ashraf();
        mu.call();
        mu.sendMessage();

        mu = new Bonny();
        mu.sendMessage();
    }
}

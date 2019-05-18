package basicJava;

public class SwitchCase {

    public static void main(String[] args) {

        int test=20;

        switch (test){
            case 10:
                System.out.println("Test is greater than 10");
                break;
            case 12:
                System.out.println("Test is greater than 12");
                break;
            case 15:
                System.out.println("Test is greater than 15");
                break;
            case 20:
                System.out.println("Test is 20");
                break;
            case 19:
                System.out.println("Test is greater than 18");
                break;
            default:
                System.out.println("Test is greater than 19");
        }

    }
}

package basicJava;

public class FindMiddleNumber {

    public static void main(String[] args) {
        int i=1;
        int j=10;

        while (++i < --j);
        System.out.println("Here Middle Number is " +i);
    }
}

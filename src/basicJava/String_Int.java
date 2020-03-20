package basicJava;

public class String_Int {

    static int mango = 20;
    static int banana = 10;
    static int total = mango+banana;

    static String list = "Total Price = $";


    public static void main(String[] args) {
        test();
    }

    public static void test(){
        System.out.println(list+total);
    }
}

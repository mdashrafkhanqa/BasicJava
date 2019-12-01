package basicJava;

public class MethodOverLoad {

    /* Method Overloading is a feature that allows a class to have more than one method
     having the same name if their arguments or parameters are different. */

    public static void test(String Name){
        System.out.println(Name);
    }

    public static void test(int Banana){
        System.out.println(Banana);

    }

    public static void main(String[] args) {
        test("Ashraf");
        test(40);

    }
}

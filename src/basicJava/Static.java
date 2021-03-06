package basicJava;

public class Static {

    /* Static keyword can be used with class, variable, method and block.
       Static members belong to the class instead of a specific instance,
       this means if you make a member static, you can access it without
       object. */

    static void myMethod()
    {
        System.out.println("myMethod");
    }

    public static void main(String[] args) {
        myMethod();
    }

}

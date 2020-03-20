package basicJava;

public class ReturnMethod {

    /* The return keyword finished the execution of a method, and can be used
     to return a value from a method. */

        static int myMethod(int x) {
            // A method with a return value
            return 5 + x;
        }

        static void myMethod() {
            //A method without any return values:
            System.out.println("I just got executed!");
        }

        public static void main(String[] args) {
            System.out.println(myMethod(3));
            myMethod();
        }
    }


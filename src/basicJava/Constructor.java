package basicJava;

public class Constructor {

    /* A constructor in Java is a special method that is used to initialize objects.
       The constructor is called when an object of a class is created. Usually
       it has the same name as the class and it doesn’t have any return value. */

    int x;

    Constructor(){
        x = 5;
    }


    public static void main(String[] args) {
        Constructor Obj = new Constructor();
        System.out.println(Obj.x);
    }



}

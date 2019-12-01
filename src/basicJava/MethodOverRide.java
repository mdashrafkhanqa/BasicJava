package basicJava;

public class MethodOverRide {

    /* When a parent class and child class joining together and we can call the method
       from parent class to child class and run it, that’s call Method overriding . */

    public static void main (String[]args){
        //Method called here creating a object
        MethodOverLoad obj = new MethodOverLoad();
        obj.test("Khan");
        //Method called here without creating a object
        MethodOverLoad.test(50);
    }

}



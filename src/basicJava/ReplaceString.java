package basicJava;

public class ReplaceString {

    public static void main (String[]args){

        String testName="zaman";
        String print= new StringBuffer(testName).replace(2,3,"zaman").reverse().toString();
        System.out.println(print);

    }
}

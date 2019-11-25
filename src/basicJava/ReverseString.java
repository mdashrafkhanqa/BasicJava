package basicJava;

public class ReverseString {

    public static void main (String[]args){

        String testName="zaman";
        String result = new StringBuffer(testName).reverse().toString();
        System.out.println(result);

    }
}

package basicJava;

import java.util.ArrayList;

public class ArrayDemo {

    public static void main(String[]args) {
        //Creating ArrayList
        ArrayList<String> list = new ArrayList<String>();
        //Adding object in ArrayList
            list.add("Zaman");
            list.add("Hasan");
            list.add("Ashraf");
            list.add("Khanjada");

            for (int i=0;i<list.size();i++){
                System.out.println(list.get(i));
            }

        }
}

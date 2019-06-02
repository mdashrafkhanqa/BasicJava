package basicJava;

import java.sql.SQLOutput;

public class TryCatch {

    public static void main(String[] args) {

        int Apple=5;
        int Orange=20;

        try {

            int result=Orange/Apple;

            System.out.println("Result=" +result);
        }catch(Exception e){

            System.out.println(e);
        }
    }
}

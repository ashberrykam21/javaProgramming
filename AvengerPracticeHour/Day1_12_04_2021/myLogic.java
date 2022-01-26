package Day1_12_04_2021;

import java.util.Locale;

public class myLogic {

    public static void main(String[] args) {
        //print the first to characters of String "Hello",result "HE"
        /*String str = "Hello";
        str = str.toUpperCase();
         String s= "" + str.charAt(0) + str.charAt(1);
        System.out.println(s);

         */

        String str = "Hello";

        str= str.substring(0,1+1).toUpperCase();
        System.out.println(str);



    }
}

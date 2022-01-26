package Day1_12_04_2021;

public class StringExample {


    public static void main(String[] args) {
         String str = "Hello";

        /* String s= str.substring(1, str.length()-1);
        System.out.println(s);

         */

        char first = str.charAt(0);
        char last = str.charAt(str.length()-1);
        str = str.replace(first,' ');
        str = str.replace(last, ' ');
        System.out.println(str.trim());



    }
}

//write a prog to return string without 1st and last char

package Day1_12_04_2021;

public class lastTwoChars {

    public static void main(String[] args) {

     // writre a program to print last 2 characters of string for 3 times
         /*String str = "Cydeo";
        int lastIndexOfChar = str.length()-1;
        int lastSecondIndexOfChar = str.length()-2;
        String result = ""+ str.charAt(lastSecondIndexOfChar)+str.charAt(lastIndexOfChar);
        System.out.println(result+result+result);*/


        String str = "Cydeo";
        int lastSecondIndexOfChar = str.length()-2;
        String sub = str.substring(lastSecondIndexOfChar);
        System.out.println(sub+sub+sub);






    }


}

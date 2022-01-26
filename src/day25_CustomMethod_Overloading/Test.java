package day25_CustomMethod_Overloading;

import utilities.StringUtility;

public class Test {

    public static void main(String[] args) {


        String str = "Java programming Language";

        StringUtility.printEachChar(str);

        System.out.println("---------------------");
        String s1 = "Wooden Spoon";
        s1 = StringUtility.reverse(s1);
        System.out.println(s1);


        System.out.println("-----------------");

        String word = "Civic";
        boolean palindrome = StringUtility.isPalindrome(word);
        System.out.println("palindrome = " + palindrome);

        System.out.println("----------------------");

        String[] names = {"Anna","Java", "Python","Mom", "Cydeo","racecar"};

        int count = 0;
        for (String each : names) {
            if(StringUtility.isPalindrome(each)){
              count++;
            }
        }
        System.out.println(count);

        System.out.println("---------------------");

        String s2 ="aaabbbsssdddtt";
        String nonDup = StringUtility.removeDuplicates(s2);
        System.out.println(nonDup);




    }
}

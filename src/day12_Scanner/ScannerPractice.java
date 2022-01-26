package day12_Scanner;

import java.util.Scanner;//regular import: imports one class. More sufficient way
// import java.util.*; it is wild import. Imports everything from the package.Takes a lot of space. better use more specified.

public class ScannerPractice {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter number between 1 to 7: ");

         int num = scan.nextInt();

         String result ="";

         if(num >= 1 && num <=7){// 7 options
           result = (num ==1)? "Monday" :(num ==2)?"Tuesday" :(num==3)?"Wednesday"
             :(num==4)?"Thursday" :(num ==5)?"Friday" :(num==6)?"Saturday" : "Sunday";


         }else{
             result = "Invalid number";
         }
        System.out.println(result);
         scan.close();
    }

}

package day17_WhileDoWhileLoops;

import java.util.Scanner;

public class EligibleToVote {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = scan.nextInt(); // valid age: 1~120

       while(!(age >=1 && age <=120)){
           System.out.println("Invalid age. Please re-enter");
           age = scan.nextInt();
       }
        System.out.println("Are you a US citizen? yes/no");
       String answer = scan.next();
       while(!(answer.equalsIgnoreCase("yes")|| answer.equalsIgnoreCase("no"))){
           System.out.println("Invalid entry. Please re-enter");
           answer = scan.next();
       }
       if(age>=18 && answer.equals("yes")){
           System.out.println("Eligible to vote");
       }else{
           System.out.println("Not eligible to vote");
       }
    }
}

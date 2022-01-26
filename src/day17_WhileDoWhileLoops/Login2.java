package day17_WhileDoWhileLoops;

import java.util.Scanner;

public class Login2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your username: ");
        String n = scan.nextLine();

        System.out.println("Enter your password: ");
        String p = scan.nextLine();
        if(n.equals("Cydeo")  && p.equals("Cydeo123") ){
            System.out.println("Logged in");
        }else {
            for (int i = 1; i <= 3; i++) {
                boolean valid =n.equals("Cydeo")  && p.equals("Cydeo123") && i<=3;
                 if(!valid){
                     System.out.println("Invalid, please re-enter");
                     System.out.println("Enter your username: ");
                     n = scan.nextLine();

                     System.out.println("Enter your password: ");
                      p = scan.nextLine();
                 }
                   if(valid){
                    System.out.println("Logged in");
                    break;
                }
                   if(i == 3){
                       System.out.println("Your account is locked");
                   }



        }
        }
            scan.close();
        }

}
/*
you are writing a code for the log-in function of the Cydeo Application,
assume that your credentials are:
                    username: Cydeo
                    password: Cydeo123

        Ask the user to enter their credentials.
                If credentials are matched, your program should print "Logged in."
                If the credentials are not matched, the program should allow
                the user to have three attempts to enter correct credentials and
                if all three attempts are failed, then print
                "Your account is lucked."

 */
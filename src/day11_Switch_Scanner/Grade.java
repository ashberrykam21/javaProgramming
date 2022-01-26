package day11_Switch_Scanner;

public class Grade {

    public static void main(String[] args) {
        char ch = 'B';
        String result ="";

        switch(ch){
            case 'A':
              result = "Excellent";   //System.out.println("Excellent");
                break;

            case 'B':
                result ="GreatJob"; //System.out.println("GreatJob");
                break;

            case 'C':
               result ="Good";  //System.out.println("Good");
                break;

            case 'D':
                result ="Passed"; //System.out.println("Passed");
                break;

            case 'F':
               result ="Failed";  //System.out.println("Failed");
                break;

            default:
                result ="Invalid"; //System.out.println("Invalid");
        }
        System.out.println(result);


    }
}
/*
 a char variable named grade is given. use switch statement to print the
 following messages:
			'A': excellent
			'B': great job
			'C': good
			'D': passed
			'F': failed
			other wise: invalid
 */
package day11_Switch_Scanner;

public class DaysInWeek {

    public static void main(String[] args) {

        int number = 9;// which day of the week 1~7( 8 possible outputs(days of week+ invalid

        switch(number){// 1,2,3,4,5,6,7

            case 1:
                System.out.println("Monday");
                break;//exits the switch after executing the case block
            case 2:
                System.out.println("Tuesday");
                break;//exits the switch after executing the case block
            case 3:
                 System.out.println("Wednesday");
                break;//exits the switch after executing the case block
            case 4:
                System.out.println("Thursday");
                break;//exits the switch after executing the case block
            case 5:
                System.out.println("Friday");
                break;//exits the switch after executing the case block
            case 6:
                System.out.println("Saturday");
                break;//exits the switch after executing the case block
            case 7:
                System.out.println("Sunday");
                break;//exits the switch after executing the case block

            default://only gets executed i none of the case blocks matching, can be placed anywhere
                System.out.println("Invalid");
                break;
                // we don't need to give break statement for the last block of  the switch in order tyo exit the switch



        }

    }
}

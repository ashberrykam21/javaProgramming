package day11_Switch_Scanner;

public class Calculator {

    public static void main(String[] args) {
        double n1 = 200.5,
                n2 = 10.5;
        char operator = '/';

        boolean valid = operator =='+' ||operator =='-' ||operator =='*' ||operator =='/';

       if(valid){

           switch (operator){
               case'+':
                   System.out.println(n1 + n2);
                   break;
               case'-':
                   System.out.println(n1 - n2);
                   break;
               case'*':
                   System.out.println(n1 * n2);
               default:
                   System.out.println(n1 / n2);
           }

       }else{
           System.out.println("Invalid operator: "+ operator);
       }


    }
}
/*
Give two double variables n1, n2 amd a char variable namedoperator.
use switch to calculate the result of n1 & n2 based ob given operators
Valid operators are: -,+, *,/
 */
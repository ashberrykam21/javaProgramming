package day08_IfStatements;



  public class SingleIfStatementIntro {
      public static void main(String[] args) {

          int number =-301;

        /*  System.out.println("Odd Number");
          System.out.println("Even Number");*/

          boolean evenNumber = number%2 == 0;
          boolean oddNumber = ! evenNumber; //mot even number
          if(evenNumber){//even numbers, truw to conditions listed
              System.out.println(number + " is even number");
          }
          if(oddNumber){//not even number, false
              System.out.println(number + " is odd number");
          }

          System.out.println("--------------------");

          int n = 200;

          // positive
          if(n>0){ // if the n is greater than zero, then its positive
              System.out.println(n + " is positive");
          }

          //negative
          if(n<0){// if n is less than zero, then its negative
              System.out.println(n + " is negative");
          }

          //equal to zero
          if(n == 0){
              System.out.println(n + " is zero");
          }



      }



}

package day09_IfStatements;

public class MinimumNumber {

    public static void main(String[] args) {

        int num1 = 175,
            num2 = 237;

        boolean num1IsMinNum = num1<num2;
        boolean num2IsMinNum = num2<num1;

        if(num1IsMinNum){
            System.out.println(num1 + " is minimum number");
        }else{
            System.out.println(num2 + " is minimum number");
        }




    }
}
/*
Minimum number between two different numbers
 */
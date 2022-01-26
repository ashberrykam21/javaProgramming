package day09_IfStatements;

public class MaximumNumber {

    public static void main(String[] args) {

        int n = 17,
            n1 = 35;

        boolean nIsMaxNum = n>n1;
        boolean n1IsMaxNum = n1>n;

        if(nIsMaxNum){
            System.out.println(n + " is maximum number");
        }else{
            System.out.println(n1 + " is maximum number");
        }


    }
}
/*
 Maximum number between two different numbers
 */
package practice_12_15_2021;

public class SumOfOdd_Even {

    public static void main(String[] args) {
        int sumOfEven = 0;
        int sumOfOdd = 0;
        int i = 0;

        do {
            if (i % 2 == 0) {
                sumOfEven += i;
            } else {
                sumOfOdd += i;
            }
            i++;
        }while(i<=10);

        System.out.println(sumOfEven);
        System.out.println(sumOfOdd);
    }
}
/*
                       (SumOfEven_Odd)
                     Write a program using while loop, that calculates the sum of the
                     even numbers between 0 and 10
                   */
package day09_IfStatements;

public class MedianNumber {

    public static void main(String[] args) {
        int a = 10,
            b = 15,
            c = 20;
        // if we have 3 different nums, one MUST be min, another MUST be median, and another MUST be median.

        boolean aIsMedian = (a > b && a < c) || (a > c && a < b),
                /*
                in order for a to be the median number;
                       1. if c is max number & b is min number, then a is median number
                       2. if b is max number & c is min number, then a is median number
                 */
                bIsMedian = (b > a && b < c) || (b > c && b < a),
                /*
                in order for b to be the median number;
                       1. if c is max number & a is min number, then b is median number
                       2. if a is max number & c is min number, then b is median number
                 */

                cIsMedian = (c > a && c < b) || (c >b && c < a);//boolean cIsMedian = !aIsMedian && ! bIsMedian;
                 /*
                 in order for c to be the median number;
                       1. if a is max number & b is min number, then c is median number
                       2. if b is max number & a is min number, then c is median number
                 */



        if(aIsMedian){// if a is the median number
            System.out.println(a + " is the median Number");
        }

        if(bIsMedian){// if b is the median number
            System.out.println(b + " is the median Number");
        }

        if(cIsMedian){//if c is the median number
            System.out.println(b + " is the median Number");
        }


    }
}
/*
Create a class called MedianNumber. write a program that can find the median number between three DIFFERENT given integers

            Ex:
                a = 10, b= 15, c = 20;

            Output:
                15 is the median number
 */
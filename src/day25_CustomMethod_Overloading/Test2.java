package day25_CustomMethod_Overloading;

import utilities.ArraysUtility;

import java.util.Arrays;

public class Test2 {


    public static void main(String[] args) {

        int[] arr1 = {1,2,3,4,5};
        ArraysUtility.printEachElement(arr1);

        System.out.println("-----------------");

        double[] arr2 = {1.5, 3.5,7.7,9.3};
        ArraysUtility.printEachElement(arr2);

        System.out.println("-------------------");

        char[] arr3 = {'A','B','C','D'};
        ArraysUtility.printEachElement(arr3);

        System.out.println("------------------------");

        String[] arr4 = {"Lena","Samantha","Bridget","David"};
        ArraysUtility.printEachElement(arr4);

        System.out.println("-----------------------");

        int[] n1 = {10,2,3,4,5,6};

        int max1 = ArraysUtility.maxNumber(n1);

        System.out.println("max1 = " + max1);

        System.out.println("---------------------------");

        double[] n2 ={3.5, 7.5, 9.9, 3.1};
        double max2 = ArraysUtility.maxNumber(n2);
        System.out.println("max2 = " + max2);

        System.out.println("----------------------");

        int[] n3 = {5,2,7,4,8,3,1};
        int min = ArraysUtility.minNumber(n3);
        System.out.println("min = " + min);

        System.out.println("-------------------");
        double[] n4 = {3.3, 5.3,7.5,1.3};
        double min2 = ArraysUtility.minNumber(n4);
        System.out.println(min2);

        System.out.println("--------------------------");

        int[] a1 = {1,2,3,4,5,6,7};
        boolean r1 = ArraysUtility.contains(a1,5);

        System.out.println("r1 = " + r1);


    }
}

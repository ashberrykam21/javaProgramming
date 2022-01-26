package day27_WrapperClasses;

import utilities.ArraysUtility;

import java.util.Arrays;

public class RemoveDuplicates {

    public static void main(String[] args) {
        int[] arr = {1,1,1,3,3,5,5,7,7,7};
        arr = removeDuplicates(arr);
        System.out.println(Arrays.toString(arr));

        String[] arr1 = {"Java","Python","Java","C#","Java"};
        arr1 = removeDuplicates(arr1);
        System.out.println(Arrays.toString(arr1));
    }


    //removes the duplicates from the given array, returns the new array
    public static int[] removeDuplicates(int[] array){
        int[] result = {};
        for (int each : array) {
           if(!ArraysUtility.contains(result, each)){
               result = ArraysUtility.addElement(result,each);
           }
        }
        return result;
    }

    //removes the duplicates from the given array, returns the new array
    public static double[] removeDuplicates(double[] array){
        double[] result = {};
        for (double each : array) {
            if(!ArraysUtility.contains(result, each)){
                result = ArraysUtility.addElement(result,each);
            }
        }
        return result;
    }

    //removes the duplicates from the given array, returns the new array
    public static char[] removeDuplicates(char[] array){
        char[] result = {};
        for (char each : array) {
            if(!ArraysUtility.contains(result, each)){
                result = ArraysUtility.addElement(result,each);
            }
        }
        return result;
    }

    //removes the duplicates from the given array, returns the new array
    public static String[] removeDuplicates(String[] array){
        String[] result = {};
        for (String each : array) {
            if(!ArraysUtility.contains(result, each)){
                result = ArraysUtility.addElement(result,each);
            }
        }
        return result;
    }


}

package day21_ForEachLoop;

import java.util.Arrays;

public class MergeTwoArrays {

    public static void main(String[] args) {


        String[]group1 ={"Ali","Lala", "Aysun"};
        String[]group2 ={"Maria","Aygun", "Suat", "Valeriy"};

        String[] students = new String[group1.length+ group2.length];// to make sure that the 3rd array has capacity to hold the names of 1st and 2nd arrays

        int i = 0;
        for (String each : group1) {
            students[i++] = each;
        }
        for (String each : group2) {
            students[i++] = each;
        }

        System.out.println(Arrays.toString(students));

        System.out.println("-----------------");

        char[] ch1 = {'A','B','C'};
        char[] ch2 ={'D', 'E','F', 'H'};

        char[] chars = new char[ch1.length+ ch2.length];

        int j =0;
        for (char ch : ch1) {
            chars[j]=ch;
            j++;
        }

        for (char ch: ch2) {
            chars[j]=ch;
            j++;
        }

        System.out.println(Arrays.toString(chars));

       /* int[] arr1 = {1,2,3,4};
        int[] arr2 = {5,6};
        int[] arr3 = new int[arr1.length+ arr2.length];
        */




    }
}
/*
 write a program that can merge two arrays of integers
        Ex:
            arr1 = {1,2,3,4}
            arr2 = {5,6}

        output
            arr3 = {1,2,3,4,5,6}

 */
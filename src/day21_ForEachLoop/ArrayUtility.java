package day21_ForEachLoop;

import java.util.Arrays;

public class ArrayUtility {

    public static void main(String[] args) {

        int[]nums = {1,2,3,4,5};

        System.out.println(nums);//hashcode

        System.out.println(Arrays.toString(nums));//to print the whole array
        System.out.println(nums[0]);//to print just element if the array

        /*String str ="Java";
        System.out.println(str);
        System.out.println(str.toString());*/

        System.out.println("-------------------------");

        int[] scores = {95,100,55,65,85,78};
        Arrays.sort(scores);//{55,65,...100}
        System.out.println(Arrays.toString(scores));

        System.out.println("Min Score: "+ scores[0]);
        System.out.println("Max Score: "+scores[scores.length-1]);

        String[] names = {"Gunay", "Anna", "Zuhal", "Ahmet", "Maria","Simen"};
        Arrays.sort(names);

        System.out.println(Arrays.toString(names));

        String[] words ={"Anna","ANNA", "anna","Hull"};

        Arrays.sort(words);
        System.out.println(Arrays.toString(words));
        System.out.println("---------------------");

        int[] arr1 = {1,3,2};
        int[] arr2 = {1,2,3};

        boolean r1 = Arrays.equals(arr1,arr2);
        System.out.println(r1);


        Arrays.sort(arr1);
        Arrays.sort(arr2);

        boolean r2 = Arrays.equals(arr1, arr2);
        System.out.println(r2);

        System.out.println("-------------------");

        char[] ch1 = {'a','c','b'};
        char[] ch2 = {'b','a','c'};

        Arrays.sort(ch1);//{a,b,c}
        Arrays.sort(ch2);//{a,b,c}
        boolean anagram = Arrays.equals(ch1,ch2);
        System.out.println(anagram);




    }
}

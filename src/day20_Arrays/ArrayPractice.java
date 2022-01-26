package day20_Arrays;

import java.util.Arrays;

public class ArrayPractice {

    public static void main(String[] args) {

        //store the elements: 10,30,50,70

        int[] numbers = {10, 30, 50, 70};//size set to 4

        System.out.println(Arrays.toString(numbers));
        System.out.println("---------------------");
        //create a variable that can contain 5 scores

        int[] scores = new int[5];
        scores[1] = 85;
        scores[scores.length-1] = 95;
        scores[3] = 75;
        scores[0] = 65;
        scores[2] = 55;

        System.out.println(Arrays.toString(scores));//second score is 85[0, 85,
        System.out.println("--------------------------------------");

        String[] months ={"January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"};//0~11(length -1)

       /* System.out.println(months[0]);//Jan
        System.out.println(months[1]);//Feb
        System.out.println(months[2]);//Mar
        System.out.println(months[3]);//Apr
        System.out.println(months[4]);//May
        System.out.println(months[5]);//Jun
        System.out.println(months[6]);//Jul
        System.out.println(months[7]);//Au
        System.out.println(months[8]);//Sep
        System.out.println(months[9]);//Oct
        System.out.println(months[10]);//Nov
        System.out.println(months[11]);//Dec */

        for (int i = 0; i < months.length ; i++) {//i: represents the index numbers of array starting from 0
            System.out.println(months[i]);
        }
        System.out.println("---------------------");

        for(int i = months.length-1; i>=0; i--){//represents the index numbers of array starting from last index going backwards
            System.out.println(months[i]);
        }
    }
}

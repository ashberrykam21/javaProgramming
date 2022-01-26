package practice_12_15_2021;

import java.util.Arrays;

public class ArrayIntro {

    public static void main(String[] args) {

        String[] color = {"Yellow","Red", "Blue"};
       String[] color2 = new String[3];

       color[0]= "Yellow";
       color[1]= "Red";
       color[2]= "Blue";


       //finding size of Array
        System.out.println(color.length);

        //equals
        int[] num = new int[4];
        num[0]= 42;
        num[1]= 35;
        num[2]= 12;
        num[3]= 9;

        int[] num1 = {1,2,3,4};
        System.out.println("Arrays.equals(num,num1)=" + Arrays.equals(num,num1));

        System.out.println("--------------------------");

        //sort
        Arrays.sort(num);
        System.out.println(Arrays.toString(num));
    }
}

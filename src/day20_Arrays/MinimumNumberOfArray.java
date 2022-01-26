package day20_Arrays;

public class MinimumNumberOfArray {

    public static void main(String[] args) {

        int[] num ={7, 45, 34,5, 75};
        int min = num[0];

        for (int i = 0; i < num.length; i++) {
            if(num[i]< min){//if there is the element in array that is smaller
                min = num[i];//then smaller number will be assigned to the variable min
            }
        }
        System.out.println(min);
    }
}

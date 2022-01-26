package day21_ForEachLoop;

public class MaximumNumber {

    public static void main(String[] args) {

        int[] numbers = {10, 5, 4,20, 1, 0};
        int max = numbers[0];

       /* for (int i = 0; i < numbers.length; i++) {
            if(numbers[i]> max){// if there is number in the array greater than current max number
                max = numbers[i];
            }

        }*/

        for(int each : numbers){
            if(each> max){
                max = each;
            }
        }
        System.out.println(max);

    }
}

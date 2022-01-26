package day21_ForEachLoop;

public class MinimumNumber {

    public static void main(String[] args) {

        int[] num ={7, 45, 34,5, 75};
        int min = num[0];

        for (int each : num) {
            if(each<min){
              min =each;
            }
        }
        System.out.println("min = " + min);
    }
}

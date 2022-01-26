package day26_CustomMethodPractice.day22_MultiDimensionalArray;

public class ForEachLoop {

    public static void main(String[] args) {

        int[][] arr2D = { {1,2,3}, {4,5,6,7}, {8,9,10,11,12} };

        /*for (int[] each1DArray : arr2D) {
            for(int eachElements : each1DArray ){
                System.out.println(eachElements);
            }
        }*/
        for (int[] each1DArray : arr2D) {
            for (int eachElement : each1DArray) {
                System.out.println(eachElement);
            }
        }

    }
}

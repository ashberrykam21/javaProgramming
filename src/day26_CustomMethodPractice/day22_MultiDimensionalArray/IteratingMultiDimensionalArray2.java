package day26_CustomMethodPractice.day22_MultiDimensionalArray;

public class IteratingMultiDimensionalArray2 {

    public static void main(String[] args) {

        int[][] arr2D = { {1,2,3}, {4,5,6,7}, {8,9,10,11,12} };

        for (int i = arr2D.length - 1; i >= 0; i--) {//i: index number of 1D array starting from last index to 0

            for (int j = 0; j < arr2D[i].length; j++) {//i: index number of elements starting from 0 to the last index
                System.out.print(arr2D[i][j]+ " ");

            }
            System.out.println();

        }

        System.out.println("-----------------------------");

        for (int i = 0; i < arr2D.length; i++) {//i: index of 1D array starting from 0

            for (int j = arr2D[i].length - 1; j >= 0; j--) {//j: index of each element startinf from last index
                System.out.print( arr2D[i][j]+" " );

            }
            System.out.println();

        }
        System.out.println("-----------------------");
        for (int i = arr2D.length - 1; i >= 0; i--) {
            for (int j = arr2D[i].length - 1; j >= 0; j--) {
                System.out.print(arr2D[i][j]+" ");
            }
            System.out.println();
        }


    }
}
/*
task1 output:
8 9 10 11 12
4 5 6 7
1 2 3
task2 output:
3 2 1
7 6 5 4
12 11 10 9 8
task3 output;
12 11 10 9 8
7 6 5 4
3 2 1
 */
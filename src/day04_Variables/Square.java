package day04_Variables;
/*
Create a class named Square, write a program that can calculate the area & perimeter
 of any given square side (3.5)
 */
public class Square {

    public static void main(String[] args) {
        //DataType variableName = Data

     // area = side * side, perimeter = 4 * side

        double side = 3.5;
        double area = side * side;
        double perimeter = 4 * side;

        System.out.println("side = " + side);
        System.out.println("area = " + area);
        System.out.println("perimeter = " + perimeter);




    }
}

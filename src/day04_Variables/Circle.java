package day04_Variables;

public class Circle {

    public static void main(String[] args) {
      //  PI, radius, diameter, area, perimeter

      double PI = 3.14;
      double radius = 10;
      double diameter = radius * 2; // 10 * 10 *3.14 // finds diameter by multiplying the radius
      double area = radius * radius * PI; // 10* 10 * 3.14 // finds the area of circle
      double perimeter = diameter * PI; // 10 * 2 * 3.14 // finds the perimeter of circle

        System.out.println("radius = " + radius);
        System.out.println("diameter = " + diameter);
        System.out.println("area = " + area);
        System.out.println("perimeter = " + perimeter);






    }



}
/*
Create a class named Circle, write a program that can calculate the area & perimeter
of any given Circle
                    Hints:  PI = 3.14
                            area = radius * radius * PI
                            Perimeter = 2 * radius * PI (perimeter = diameter * PI)
 */
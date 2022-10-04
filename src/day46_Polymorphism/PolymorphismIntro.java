package day46_Polymorphism;

import day44_Abstraction.animalTask.*;
import day43_Abstraction.employee.*;
import day45_Abstraction.shape.Circle;
import day45_Abstraction.shape.Rectangle;
import day45_Abstraction.shape.Shape;
import day45_Abstraction.shape.Square;

import java.awt.*;
import java.util.ArrayList;

public class PolymorphismIntro {

    public static void main(String[] args) {

        String str = "Wooden Spoon";

        Integer n1 = 2;

        Double n2 = 5.5;

        Boolean r1 = true;

        Object[] array = {str, n1, n2, r1, new Circle(4) , new Square(7)};

        /*
            WebDriver driver;
            driver = new ChromeDriver();
            driver = new FireFoxDriver();
         */



        Employee tester = new Tester("Ali",30,'M',42,"SDET",145000.00);
        Employee developer = new Developer("Alex",28,'M',32,"Web Developer",155000.00);
        Employee teacher = new Teacher("Angel",28,'F',22,"English Teacher",85000.00);
        Employee driver = new Driver("Jhon",34,'M',42,"Lyft Driver",75000.00);

        ArrayList<Person> cydeoEmployees = new ArrayList();

        cydeoEmployees.add(tester);
        cydeoEmployees.add(developer);
        cydeoEmployees.add(teacher);
        cydeoEmployees.add(driver);


        System.out.println("-------------------------------------------");

        Employee employee = new Tester("Ali",30,'M',42,"SDET",145000.00);
        employee.work();

        Animal animal = new Dog("Max","Husky",'M',3,"large","Grey");
        animal.drink();
        animal.eat();
        //animal.play();compile error cuz animal does not have play method. so we can not access it
        //animal.bark

        Playable animal2 = new Dog( "Max","Husky",'M',3,"large","Grey");
        System.out.println(animal2.isFriendly);
        //animal2.drink(); the only reference here is Playable, so we can not access methods of Dog or animal, cuz they dont have reference


        Animal animal3 = new Cat("Tuzik","Bengal",'M',4,"medium","orange");

        Shape shape = new Circle(5);
        shape.area();

        //System.out.println(shape.getRadius);compile error
        //System.out.println(shape.PI);compile error

        boolean isSquare = shape instanceof Square;
        System.out.println("isSquare = "+ isSquare);

        boolean isCircle = shape instanceof Circle;
        System.out.println("isCircle = "+isCircle);

    }


}
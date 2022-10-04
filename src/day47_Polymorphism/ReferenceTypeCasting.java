package day47_Polymorphism;

import day37_Inheritance.scrumTask.Developer;
import day43_Abstraction.employee.*;
import day44_Abstraction.animalTask.Animal;
import day44_Abstraction.animalTask.Cat;
import day44_Abstraction.animalTask.Dog;
import day45_Abstraction.shape.Circle;
import day45_Abstraction.shape.Cube;
import day45_Abstraction.shape.Shape;
import day45_Abstraction.shape.Square;

public class ReferenceTypeCasting {

    public static void main(String[] args) {

       Shape shape =(Shape) new Circle(4);// upcasting done implicitly u don't need to give the casting operator
       Shape shape2 = new Circle(5);

        Animal animal = new Dog("Max","Husky",'M',3,"small","white");

       // Dog dog = (Dog) animal;//downcasting
        System.out.println(animal.getName());
        //System.out.println(dog.getName());

        ((Dog) animal).bark();// if u want the animal to bark u have explicitly cast it to dog
                              // downcasting
       // dog.bark();

        Shape shape1 = new Square(5);
        System.out.println( ((Square)shape1).getSide() );

        System.out.println("--------------------------");
        Animal animal2 = new Cat("Jim","Scottish",'M',5,"medium","White");

       // Cat cat = (Cat) animal2;
        //cat.meow();

        ((Cat) animal2).meow();
        //((Dog)animal2).bark();

        System.out.println("-------------------------");

        Employee employee = new Tester("Ali",37,'M',1352,"SDET",100000);

        ( (Tester) employee).bugReport();
        //( (Tester) employee).fixBugs(); u can not call this method cuz it belongs to developer and Tester doesn't have isA relationship with Dev

        //Driver driver = (Driver) employee;//classCastException cuz there is no isA relationship between tester and driver
        Person person = (Person) employee;// upcasting
        //Teacher teacher = (Teacher)employee;//classCastException cuz there is no isA relationship between tester and teacher

        Shape s1 = new Circle(10);
        s1.area();
        s1.perimeter();
        //((Cube)s1).volume();// classCastException. cuz circle can not be converted to cube



    }
}

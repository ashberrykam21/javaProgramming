package day43_Abstraction.car;

public class CarShop {

    public static void main(String[] args) {

        //Car car = new Car("Cydeo","Batch25","blue",2022,200000);
              // we can not create object from abstract class, cuz abstract class is not concrete

        Honda honda = new Honda("Accord","White",2019,30000);

        Audi audi = new Audi("Q7","Blue",2015, 14000);

        Tesla tesla = new Tesla("Model3","White",2022, 75000);


        System.out.println(honda);
        System.out.println(audi);
        System.out.println(tesla);

        System.out.println("--------------------------");

        honda.setColor("Red");
        audi.setColor("Pink");
        tesla.setColor("Green");

        System.out.println(honda);
        System.out.println(audi);
        System.out.println(tesla);

        System.out.println("--------------------------");

        honda.setPrice(2500);
        audi.setPrice(7000);
        tesla.setPrice(17000);

        System.out.println(honda);
        System.out.println(audi);
        System.out.println(tesla);

    }
}

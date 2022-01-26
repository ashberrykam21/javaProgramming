package day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class CarObjects {

    public static void main(String[] args) {
        Car car1 =new Car();
        car1.setInfo("Nissan","Xterra","White",2015,27000);
        System.out.println(car1);

        Car car2 = new Car();
        car2.setInfo("BMW","X6","White",2022,67000);
        System.out.println(car2);

        Car car3 = new Car();
        car3.setInfo("Lexus","NX","Dark Blue",2021,42770);
        System.out.println(car3);


        //Car[] cars = {car1, car2, car3};Array is doible but ArrayList more efficient

        ArrayList<Car> carsList = new ArrayList<>();
        carsList.addAll(Arrays.asList(car1,car2,car3));

        for (Car each : carsList) {
            System.out.println(each.brand + " : "+ each.price);
        }
        System.out.println("---------------------------");
        /*
        Eligible for recall
        BMW: 2005~2008
        Nissan: 1995~1997
         */
        carsList.removeIf(p -> p.brand.equals("BMW")&& p.year>=2005 && p.year<=2008);
        carsList.removeIf(p -> p.brand.equals("Nissan") && p.year>=1995 && p.year<=1997);


    }

}

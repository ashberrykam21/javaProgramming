package day31_Constructors;

import java.util.ArrayList;
import java.util.Arrays;

public class PizzaOrdering {

    public static void main(String[] args) {

        ArrayList<Pizza> pizzas = new ArrayList<>();


        //create 100 pizza objects: size - 'S', cheese Topping-2, pepperoni toppings - 3
        //create 100 pizza objects: size - 'M', cheese Topping-3, pepperoni toppings - 4
        //create 100 pizza objects: size - 'L', cheese Topping-4, pepperoni toppings - 5

        for (int i = 0; i < 100; i++) {
            Pizza smallPizza = new Pizza('S',2,3);
            Pizza mediumPizza = new Pizza('M',3,4);
            Pizza largePizza = new Pizza('L',4,5);

            pizzas.addAll(Arrays.asList(smallPizza,mediumPizza,largePizza));

        }

        System.out.println("Total number of pizza: "+ pizzas.size());

        double totalPrice = 0;

        for (Pizza each : pizzas) {
           totalPrice += each.calcCost();
        }
        System.out.println("totalPrice = " + totalPrice);

    }
}

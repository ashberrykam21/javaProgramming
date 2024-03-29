package day52_Map_FunctionalInterface;
//lambda: () -> {}
public class Test {

    public static void main(String[] args) {

        // function1: create the function that can display a number is odd or even
        MyFirstFunctionalInterface oddNumberOrEvenNumber = (n) -> {
            if(n%2==0){
                System.out.println(n+" is even number");
            }else{
                System.out.println(n+" is odd number");
            }
        };
        oddNumberOrEvenNumber.apply(20);


        //function2: create the function that can check if the person is eligible to buy alcohol
        MyFirstFunctionalInterface eligibleToBuyAlcohol;
        eligibleToBuyAlcohol= (age) -> {
            if(age>=21){
                System.out.println("Eligible to buy alcohol");
            }else{
                System.out.println("Not eligible to buy alcohol");
            }
        };
        eligibleToBuyAlcohol.apply(100);


        //function3: create the function that can display the cube of number
        MyFirstFunctionalInterface printCube;
        printCube = (n) -> {
            System.out.println(n*n*n);
        };
        printCube.apply(3);

        //function4: create the function that can check if the number is evenly divisible by 3 and 5
        MyFirstFunctionalInterface divisibleBy3And5;
        divisibleBy3And5 = n -> {
           if(n%15==0){
               System.out.println(n+" is divisible by 3 and 5");
           }else{
               System.out.println(n+" is not divisible by 3 and 5");
           }
        };
        divisibleBy3And5.apply(30);



    }
}

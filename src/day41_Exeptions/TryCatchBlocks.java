package day41_Exeptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TryCatchBlocks {

    public static void main(String[] args) {
        System.out.println("Test started");

        try {
            System.out.println(9 / 0);
        }catch(ArithmeticException e){
            System.out.println("Catch block");
            System.out.println("Arithmetic Exception has occurred");
        }

        System.out.println("Test 1 Completed");
        System.out.println("----------------------------");

        System.out.println("Test 2 started");

        int[] numbers = {1,2,3,4,5};
        try {
            System.out.println(numbers[200]);
            System.out.println("Try block");
        }catch(RuntimeException e){
            e.printStackTrace();//returns detailed report of exception. Preferable way
            //System.out.println(e.getMessage());// get brief description of exception
        }
        System.out.println("Test 2 Completed");

        System.out.println("-----------------------------");

        System.out.println("Test 3 started");

        try {
            System.out.println("Cydeo".substring(2, 0));
        }catch(RuntimeException e){
            e.printStackTrace();
        }
        System.out.println("Test 3 completed");

        System.out.println("-----------------------");

        System.out.println("Hello");


        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        System.out.println("Cydeo");

        System.out.println("-------------------------------");

        try {
            FileInputStream file = new FileInputStream("File path");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }
}

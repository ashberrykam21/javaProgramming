package day41_Exeptions;

import day39_Recap.cydeoTask.Employee;

public class MultiCatchBlocks {

    public static void main(String[] args) {

        Employee employee = null;



        try{
            System.out.println(employee.getSalary());
        }catch(IndexOutOfBoundsException e){
            System.out.println("First catch block");
            e.printStackTrace();
        }catch(ArithmeticException e){
            System.out.println("Second catch block");
            e.printStackTrace();
        }





        System.out.println("Test completed");
    }
}

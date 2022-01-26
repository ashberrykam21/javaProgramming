package day28_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListMethods1 {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);//0
        numbers.add(20);//1
        numbers.add(30);//2
        numbers.add(40);//3
        numbers.add(50);//4
        numbers.add(60);//5

         numbers.add(2,25);
         numbers.add(5,45);
        System.out.println(numbers);

        System.out.println(numbers.size());

        int lastIndex = numbers.size()-1;
        System.out.println(lastIndex);

        int num = numbers.get(3);

        System.out.println("num = " + num);
        System.out.println("-----------------------------");

        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }
            System.out.println("-----------------------------");

            ArrayList<String> list = new ArrayList<>();
            list.add("Java");
            list.add("Python");
            list.add("Java");
            list.add("C#");
            list.add("Ruby");


            list.set(2,"JavaScript");
            list.set(3,"C++");

            System.out.println(list);
        System.out.println("--------------------");

        ArrayList<String> employees = new ArrayList<>();

        employees.add("Brendon");
        employees.add("Haile");
        employees.add("Sam");
        employees.add("Cassandra");
        employees.add("Mary");
        employees.add("Courtney");
        employees.add("Dani");

        System.out.println(employees);

        employees.remove(0);
        System.out.println(employees);

        employees.remove(1);
        System.out.println(employees);

        employees.remove(employees.size()-1);
        System.out.println(employees);

        boolean r1 = employees.remove("Courtney");
        System.out.println(employees);

        boolean r2 = employees.remove("Mary");
        System.out.println(employees);

        System.out.println(r1);
        System.out.println(r2);

        System.out.println("-------------------------");

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(100);
        list1.add(100);
        list1.add(100);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(100);
        list2.add(100);
        list2.add(100);

        System.out.println(list1 == list2);// gonna give false cuz the new keyboard was used, so its two different objects
        System.out.println(list1.equals(list2));//will check if the elements are the same and in the same order, if so will give true


        System.out.println("-------------------------");
         list1.clear();
        boolean r4 = list1.isEmpty(); // false
        System.out.println("r4 = " + r4);

        ArrayList<Integer> numbers1 = new ArrayList<>();
        //Bulk Operation: Collection Type
        numbers.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));

        System.out.println(numbers1);





    }
}

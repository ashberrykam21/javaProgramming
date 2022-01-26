package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice2 {

    public static void main(String[] args) {

        ArrayList<String> employees = new ArrayList<>();
        employees.addAll(Arrays.asList("Ali","David","Ahmet","Jimmy","Daniel","Aaron","David","Shay"));

        employees.retainAll(  Arrays.asList("Ahmet", "David"));

        System.out.println(employees);
        System.out.println("------------------------");

        String[] names = {"Mary","Monica","Hanna","Lucy","Beril","Mehrai","Musti"};
        ArrayList<String> list = new ArrayList<>(Arrays.asList(names));

        list.removeIf(p -> p.charAt(0)=='M');

       names =  list.toArray(new String[0]);

        System.out.println(Arrays.toString(names));


    }
}

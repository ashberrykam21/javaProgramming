package day51_Map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapMethods {

    public static void main(String[] args) {

        // student name and score:

        Map<String, Integer> students = new HashMap<>();

        students.put("Aygun",85);
        students.put("Maria",95);
        students.put("Ali",96);
        students.put("Alex",98);
        students.put("Ozan",97);
        students.put("Sercan",87);
        students.put("Adrey",98);

        students.put("Ali",86);
        students.put("Ali",76);
        students.put("Ali",95);
        System.out.println(students);
        System.out.println(students.size());

        //display the score of Alex
        System.out.println(students.get("Alex"));

        //replace Ali' score to 90
        students.replace("Ali", 90);
        System.out.println(students);

        students.remove("Alex");
        System.out.println(students);

        boolean r1 = students.containsKey("Muhtar");
        System.out.println(r1);

        boolean r2 =students.containsValue(97);
        System.out.println(r2);

        System.out.println(students.isEmpty());

        System.out.println("------------------------------");

        Map<String, Integer> map1 = new HashMap<>();
        map1.putAll(students);

        Map<String, Integer> map2 = new HashMap<>();
        map2.putAll(students);

        System.out.println("map1 = " + map1);
        System.out.println("map2 = " + map2);

        System.out.println(map1==map2);
        System.out.println(map1.equals(map2));

        map1.clear();
        System.out.println(map1);


    }
}

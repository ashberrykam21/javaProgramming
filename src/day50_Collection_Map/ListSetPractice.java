package day50_Collection_Map;

import javax.xml.stream.events.Characters;
import java.util.*;

public class ListSetPractice {

    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>();
        set.addAll(Arrays.asList(1,2,3,4,5,1,2,3,4,5));

        System.out.println(set);
        set.toArray(new Integer[0]);

       // Integer[] array = set.toArray(new Integer[0]);

        List<Integer> list = new ArrayList<>( set );

        System.out.println(list);

        List<String> names = null;

        //System.out.println(names.size());

        System.out.println("------------------------------");

        //pop() ==> LIFO
        List<Character> chars = new Stack<>();
        chars.addAll(Arrays.asList('A','B','C','D'));//[A,B,C,D]

        ((Stack)chars).pop();

        System.out.println("chars = "+chars);

        //poll() ==>FIFO

        List<String> name = new LinkedList<>();
        name.addAll(Arrays.asList("James","Jimmyu","Kathy","Brenna","Max"));

        ((LinkedList<String>)name).poll();

        System.out.println(name);



    }
}

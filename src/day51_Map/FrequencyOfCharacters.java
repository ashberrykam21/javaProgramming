package day51_Map;

import java.util.*;

public class FrequencyOfCharacters {

    public static void main(String[] args) {

    String str = "bbcccaaaaa";
        //           bca
        //           235
        //Collections.frequency()

    String[] arr = str.split("");

        Map<String, Integer> result = new LinkedHashMap<>();// {b=2, c=3, a=5}

        for (String each : arr) {// each: characters of string
            result.put(each, Collections.frequency(Arrays.asList(arr), each));
        }
        System.out.println(result);
    }
}
/*
2. Wirte a program that can return the freuqency of characters
        Not: MUST use map

        Ex: str = "bbcccaaaaa"

        output:
            {b=2, c=3, a=5}
 */
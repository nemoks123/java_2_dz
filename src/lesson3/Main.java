package lesson3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String[] slova = {"apple", "apple", "green","pear", "name", "green", "yellow", "fio" , "banana", "pear"};
        Map<String,Integer> map = new HashMap<>();
        for (int i = 0; i < slova.length; i++) {
            Integer values = map.getOrDefault(slova[i], 0);
            map.put(slova[i], values + 1);
        }
        System.out.println(map);

       Directory directory = new Directory();
       directory.add( "Ivanov","345123");
        directory.add( "Petrov","3451223");
       directory.get("Ivanov");
    }
}

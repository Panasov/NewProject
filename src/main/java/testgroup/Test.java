package testgroup;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        for (int element: array) {
            System.out.println(element);
        }
        Map<String, Integer> map = new HashMap<>();
        map.put("first", 1);
        map.put("second", 2);
        map.put("third", 3);
        map.put("fourth", 4);

        for(String element: map.keySet()){
            System.out.println(element + " " + map.get(element));
        }

        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");

        for(String element: list) {
            System.out.println(element);
        }
    }
}

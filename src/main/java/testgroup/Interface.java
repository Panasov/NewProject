package testgroup;

import java.util.*;

public class Interface {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        Map<String, Integer> map = new HashMap<>();
        Queue<String> queue = new LinkedList<>();

        list.add("One");
        list.add("Two");
        set.add(1);
        map.put("First", 1);
        map.put("Second", 2);
        queue.offer("First");

        System.out.println(list);
        System.out.println(set);
        System.out.println(map);
        System.out.println(queue);

        for (String s : list) {
            System.out.println(s);
        }

//            Iterator<String> iterator = list.iterator();
//            while (iterator.hasNext()) {
//                System.out.println(iterator.next());
//        }

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}


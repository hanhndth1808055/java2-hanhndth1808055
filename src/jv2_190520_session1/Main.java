package jv2_190520_session1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.PriorityQueue;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(2);

        HashSet<String> strs = new HashSet<>();
        strs.add("hello");
        strs.add("world");
        strs.add("hello");
//        for (String s : strs) {
//            System.out.println(s);
//        }

        //Delete the first duplicated object
        PriorityQueue<String> strQueue = new PriorityQueue<>();

        strQueue.add("abc");
        strQueue.add("cba");
        strQueue.add("bca");

        for (String s: strQueue){
            System.out.println(s);
        }
        PriorityQueue<Human> hQueue = new PriorityQueue<>();
        hQueue.add(new Human(5, "Nam"));
        hQueue.add(new Human(4, "Vinh"));
        hQueue.add(new Human(18, "Dung"));

        for (Human h: hQueue){
            System.out.println(h.name);
        }

        HashMap<String, String> hs = new HashMap<>();
        hs.put("a1", "Le Van Nam");
        hs.put("a2", "Le Van Dung");

        System.out.println(hs.get("a1"));

        hs.forEach((keyStr, valStr) -> {
            System.out.println("Phan tu co key: " + keyStr + " co gia tri: " + valStr );
        });
    }
}

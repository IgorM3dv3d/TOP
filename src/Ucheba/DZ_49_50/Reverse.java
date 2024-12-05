package Ucheba.DZ_49_50;

import java.util.*;

public class Reverse {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "A");
        map.put(2, "B");
        map.put(3, "C");
        map.put(4, "D");

        HashMap<String, List<Integer>> inverseMap = new HashMap<>();

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            if (inverseMap.containsKey(entry.getValue())) {
                inverseMap.get(entry.getValue()).add(entry.getKey());
            } else {
                List<Integer> list = new ArrayList<>();
                list.add(entry.getKey());
                inverseMap.put(entry.getValue(), list);
            }
        }
        System.out.println(inverseMap);
    }
}

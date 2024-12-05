package Ucheba.DZ_49_50;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class hashMaps {
    public static void main(String[] args) {
        String word = "java is fun and java is powerful";
        Map<Character, Integer> map = new LinkedHashMap<>();
        String space = word.replaceAll(" ", "");

        for (int i = 0; i < space.length(); i++) {
            char ch = space.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        System.out.println(map);
    }
}

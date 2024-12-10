package Ucheba.DZ_53_54;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetStr {
    public static void main(String[] args) {
        String[] words = {"Illya", "Tanya", "Illya", "Tanya", "Dmitry"};
        System.out.println(getLinkHashSet(words));
    }

    public static Set<String> getLinkHashSet(String[] word) {
        Set<String> linkHashSet = new LinkedHashSet<>();
        for (String s : word) {
            linkHashSet.add(s);
        }
        return linkHashSet;
    }
}

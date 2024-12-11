package Ucheba.DZ_57_58;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingNames {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Bob");
        names.add("Wilson");
        names.add("Jack");
        names.add("Emmy");
        names.add("Anna");
        names.add("Nick");

        System.out.println(names);

        names.sort(Comparator.comparingInt(String::length));
        System.out.println(names);

        Collections.sort(names, (n1, n2) -> n1.compareTo(n2));
        System.out.println(names);
    }
}

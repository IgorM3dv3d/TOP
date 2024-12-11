package Ucheba.DZ_57_58;

import java.util.*;

public class StreamApi {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "fig", "date", "kiwi", "grape");

        List<String> newWords = words.stream()
                .map(word -> word.toUpperCase())
                .filter(word -> word.length() > 4)
                .peek(word -> System.out.println(word))
                .sorted(Comparator.comparingInt(String::length))
                .toList();

        System.out.println(newWords);
    }
}

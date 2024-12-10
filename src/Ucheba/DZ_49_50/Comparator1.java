package Ucheba.DZ_49_50;

import java.util.*;

public class Comparator1 {
    public static void main(String[] args) {
        Map<Students, Integer> map = new TreeMap();

        Students s1 = new Students("Alexei", 23);
        Students s2 = new Students("Andrey", 20);
        Students s3 = new Students("Sergey", 22);
        Students s4 = new Students("Lisa", 26);
        Students s5 = new Students("Polina", 25);

        List<Students> studentsList = new ArrayList<>();
        studentsList.add(s1);
        studentsList.add(s2);
        studentsList.add(s3);
        studentsList.add(s4);
        studentsList.add(s5);

        System.out.println("список по алфавиту - " + studentsList);

        List<Students> studentsList2 = new ArrayList<>();
        studentsList2.add(s1);
        studentsList2.add(s2);
        studentsList2.add(s3);
        studentsList2.add(s4);
        studentsList2.add(s5);

        studentsList2.sort(new Comparator2());
        System.out.println("список по возрасту - " + studentsList2);
    }
}

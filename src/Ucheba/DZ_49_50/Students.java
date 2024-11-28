package Ucheba.DZ_49_50;

import java.util.Comparator;

public class Students implements Comparable<Students> {
    private String name;
    private int age;

    public Students(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student [" + name + ", " + age + "]";
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(Students o) {
        return Comparator.comparing(Students::getName)
                .thenComparing(Students::getAge)
                .compare(this, o);
    }
}

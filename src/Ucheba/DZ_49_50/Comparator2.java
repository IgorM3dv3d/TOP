package Ucheba.DZ_49_50;

import java.util.Comparator;

public class Comparator2 implements Comparator<Students> {

    @Override
    public int compare(Students o1, Students o2) {
        if (Integer.compare(o1.getAge(), o2.getAge()) == 0) {
            return o1.getName().compareTo(o2.getName());
        }
        return Integer.compare(o2.getAge(), o1.getAge());
    }
}



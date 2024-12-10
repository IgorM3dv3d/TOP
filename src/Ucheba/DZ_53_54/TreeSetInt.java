package Ucheba.DZ_53_54;

import java.util.Arrays;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetInt {
    public static void main(String[] args) {
        int[] msv = {7, 13, 21, 24, 32};
        int target = 17;
        int[] result = findClosestNumbers(msv, target);
        System.out.println(Arrays.toString(result));
    }

    public static int[] findClosestNumbers(int[] msv, int target) {
        NavigableSet<Integer> set = new TreeSet<Integer>();
        for (int i = 0; i < msv.length; i++) {
            set.add(msv[i]);
        }
        return new int[]{set.lower(target), set.higher(target)};
    }
}

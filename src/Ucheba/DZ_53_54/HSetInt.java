package Ucheba.DZ_53_54;

import java.util.HashSet;
import java.util.Set;

public class HSetInt {
    public static void main(String[] args) {
        int[] nums = {4, 6, 1, 3, 25, 6 ,4, 2};
        System.out.println(findNums(nums));
    }

    public static Set<Integer> findNums (int[] arr){
        Set<Integer> nums1 = new HashSet<>();
        for (Integer numbs : arr) {
            nums1.add(numbs);
        }
        return nums1;
    }
}

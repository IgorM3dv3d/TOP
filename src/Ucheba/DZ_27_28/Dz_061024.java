package Ucheba.DZ_27_28;

import java.util.Arrays;

public class Dz_061024 {
    public static void main(String[] args) {
        int[][] nums = new int[3][3];

        fillArray(nums);
        printArray(nums);

        findSumLines(nums);
        findSumColumns(nums);

        int[] massive1 = new int[]{3, 7, 2, 15, 25, 13};
        System.out.println("Исходный массив: " + Arrays.toString(massive1));
        changeArray(massive1);
        System.out.println("После изменений исходника: " + Arrays.toString(massive1));
        changeCopyArray(massive1);
        System.out.println("После изменений копии: " + Arrays.toString(massive1));

    }

    static void changeArray(int[] massive1) {
        Arrays.sort(massive1);
    }

    static void changeCopyArray(int[] massive1) {
        int[] massive1Copy = Arrays.copyOf(massive1, massive1.length);

        Arrays.fill(massive1Copy, 0);
        System.out.println(Arrays.toString(massive1Copy));
    }


    static void findSumColumns(int[][] nums) {
        System.out.println("Сумма элементов по колонам: ");
        int[] sumColumnsResult = sumColumns(nums);
        for (int i : sumColumnsResult) {
            System.out.println("Сумма колонн: " + i);
        }
    }

    /**
     * @param nums
     * @return
     */
    static int[] sumColumns(int[][] nums) {
        int[] result = new int[nums[0].length];

        for (int i = 0; i < nums[0].length; i++) {
            for (int j = 0; j < nums.length; j++) {
                result[i] += nums[j][i];
            }
        }

        return result;
    }

    static void findSumLines(int[][] nums) {
        System.out.println("Сумма элементов по строкам: ");
        int[] sumLinesResult = sumLines(nums);
        for (int i : sumLinesResult) {
            System.out.println("Сумма строки: " + i);
        }
    }

    static int[] sumLines(int[][] nums) {
        int[] result = new int[nums.length];

        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[0].length; j++) {
                sum += nums[i][j];
            }
            result[i] = sum;
            sum = 0;
        }

        return result;
    }

    /**
     * @param nums
     */
    static void fillArray(int[][] nums) {
        int count = 1;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[0].length; j++) {
                nums[i][j] = count;
                count++;
            }
        }
    }

    /**
     * @param nums
     */
    static void printArray(int[][] nums) {
        for (int[] inboxNums : nums) {
            for (int num : inboxNums) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

}

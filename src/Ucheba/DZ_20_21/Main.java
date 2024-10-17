package Ucheba.DZ_20_21;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int num1 = 14;
        int num2 = 25;
        int num3 = 36;
        System.out.println(Method.square(num1));
        System.out.println(Method.square(num2));
        System.out.println(Method.square(num3));

        Method.printFullName();

        String[] words = new String[7];
        words[0] = "Bucket";
        words[1] = "Banana";
        words[2] = "Egg";
        words[3] = "Objectivization";
        words[4] = "Tree";
        words[5] = "Globus";
        words[6] = "Eagle";
        System.out.println(Arrays.toString(Method.cornerValuesArray(words)));


        System.out.println(Method.factR(7));
        System.out.println(Method.factR(9));
        System.out.println(Method.factR(12));
    }
}

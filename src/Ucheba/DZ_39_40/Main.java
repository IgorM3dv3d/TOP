package Ucheba.DZ_39_40;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        House house1 = new House.Builder()
                .floors(2)
                .rooms(5)
                .garage(1)
                .build();

        System.out.println(house1);

        House house2 = new House.Builder()
                .floors(1)
                .rooms(2)
                .garage(0)
                .build();

        System.out.println(house2);


        House house3 = new House.Builder()
                .floors(3)
                .rooms(5)
                .garage(0)
                .build();

        House house4 = new House.Builder()
                .floors(2)
                .rooms(3)
                .garage(1)
                .build();

        ArrayList<House> houses = new ArrayList<>();
        houses.add(house1);
        houses.add(house2);
        houses.add(house3);
        houses.add(house4);

        System.out.println("Дом 3 находится в списке: " + (houses.contains(house3)));
        System.out.println("Дом 1 находится в списке: " + (houses.contains(house1)));
        System.out.println("Индекс дома 2: " + (houses.indexOf(house2)));
        System.out.println("Индекс дома 4: " + (houses.indexOf(house4)));

        System.out.println(house1.hashCode());
        System.out.println(house2.hashCode());
        System.out.println(house3.hashCode());
        System.out.println(house4.hashCode());

        System.out.println(house1.equals(house2));

    }
}

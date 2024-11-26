package Ucheba.DZ_45_46;

import java.util.*;
import java.util.Arrays;
import java.util.Collections;

public class Car implements Comparable<Car> {
    private String model;
    private Integer year;
    private String color;

    public Car(String model, int year, String color) {
        this.model = model;
        this.year = year;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" + "model=" + model + ", year=" + year + ", color=" + color + '}';
    }


    public static void main(String[] args) {
        Car car1 = new Car("Lada", 2024, "Black");
        Car car2 = new Car("Lada", 2024, "White");
        Car car3 = new Car("Lada", 2024, "Red");
        Car car4 = new Car("Lada", 2023, "Gray");
        Car car5 = new Car("Volga", 2024, "Black");
        Car car6 = new Car("Volga", 2023, "White");
        Car car7 = new Car("Volga", 2022, "Red");
        Car car8 = new Car("Audi", 2020, "Red");


        List<Car> cars = new ArrayList<>();
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
        cars.add(car5);
        cars.add(car6);
        cars.add(car7);
        cars.add(car8);

        List<Car> cars1 = new ArrayList<>();
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
        cars.add(car5);
        cars.add(car6);
        cars.add(car7);
        cars.add(car8);

        List<Car> cars2 = new ArrayList<>();
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
        cars.add(car5);
        cars.add(car6);
        cars.add(car7);
        cars.add(car8);

        Collections.sort(cars);
        for (Car car : cars) {
            System.out.println(car);
        }
    }


    @Override
    public int compareTo(Car o) {
        int comp = this.model.compareTo(o.model);
        int comp1 = (o.year).compareTo(this.year);
        int comp2 = this.color.compareTo(o.color);

        if (comp == 0) {
            return comp;
        } else {
        }
        return comp;

//        if (comp1 == 0) {
//            return comp;
//        } else {
//        } return comp1;
//
//        if (comp2 == 0) {
//            return comp;
//        } else {
//        } return comp2;
    }
}



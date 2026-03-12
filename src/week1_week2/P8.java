package week1_week2;

import java.util.*;

public class P8 {

    static String[] parking = new String[500];

    public static int parkVehicle(String plate) {

        int hash = Math.abs(plate.hashCode()) % 500;

        while (parking[hash] != null) {
            hash = (hash + 1) % 500;
        }

        parking[hash] = plate;

        return hash;
    }

    public static void main(String[] args) {

        System.out.println("Spot: " + parkVehicle("ABC1234"));
        System.out.println("Spot: " + parkVehicle("XYZ9999"));
    }
}
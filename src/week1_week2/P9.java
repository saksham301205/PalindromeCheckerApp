package week1_week2;

import java.util.*;

public class P9 {

    public static void twoSum(int[] arr, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : arr) {

            int complement = target - num;

            if (map.containsKey(complement)) {
                System.out.println(num + " + " + complement);
            }

            map.put(num, 1);
        }
    }

    public static void main(String[] args) {

        int[] arr = {500, 300, 200};

        twoSum(arr, 500);
    }
}
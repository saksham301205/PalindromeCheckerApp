package week1_week2;

import java.util.*;

public class P1 {

    static HashMap<String, Integer> users = new HashMap<>();

    public static boolean checkAvailability(String username) {
        return !users.containsKey(username);
    }

    public static void main(String[] args) {

        users.put("john_doe",1);

        System.out.println(checkAvailability("john_doe"));
        System.out.println(checkAvailability("jane_smith"));
    }
}
package week1_week2;

import java.util.*;

public class P10 {

    static LinkedHashMap<String, String> L1 = new LinkedHashMap<>(10000, 0.75f, true);

    public static String getVideo(String id) {

        if (L1.containsKey(id)) {
            return "L1 Cache HIT";
        }

        return "Cache MISS → fetch from DB";
    }

    public static void main(String[] args) {

        L1.put("video_123", "data");

        System.out.println(getVideo("video_123"));
        System.out.println(getVideo("video_999"));
    }
}
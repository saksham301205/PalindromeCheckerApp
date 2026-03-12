package week1_week2;

import java.util.*;

public class P7 {

    static HashMap<String, Integer> queries = new HashMap<>();

    public static List<String> search(String prefix) {

        List<String> results = new ArrayList<>();

        for (String q : queries.keySet()) {
            if (q.startsWith(prefix)) {
                results.add(q);
            }
        }

        return results;
    }

    public static void main(String[] args) {

        queries.put("java tutorial", 100);
        queries.put("javascript", 80);
        queries.put("java download", 60);

        System.out.println(search("jav"));
    }
}
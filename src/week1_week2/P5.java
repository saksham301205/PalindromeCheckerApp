package week1_week2;

import java.util.*;

public class P5 {

    static HashMap<String, Integer> pageViews = new HashMap<>();
    static HashMap<String, Set<String>> uniqueVisitors = new HashMap<>();
    static HashMap<String, Integer> trafficSources = new HashMap<>();

    public static void processEvent(String url, String userId, String source) {

        pageViews.put(url, pageViews.getOrDefault(url, 0) + 1);

        uniqueVisitors.putIfAbsent(url, new HashSet<>());
        uniqueVisitors.get(url).add(userId);

        trafficSources.put(source, trafficSources.getOrDefault(source, 0) + 1);
    }

    public static void main(String[] args) {

        processEvent("/article/news", "user1", "google");
        processEvent("/article/news", "user2", "facebook");

        System.out.println(pageViews);
        System.out.println(uniqueVisitors);
        System.out.println(trafficSources);
    }
}
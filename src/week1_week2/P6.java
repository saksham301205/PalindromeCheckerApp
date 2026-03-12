package week1_week2;

import java.util.*;

class TokenBucket {
    int tokens;
    long lastRefill;

    TokenBucket(int maxTokens) {
        tokens = maxTokens;
        lastRefill = System.currentTimeMillis();
    }
}

public class P6 {

    static HashMap<String, TokenBucket> clients = new HashMap<>();
    static final int LIMIT = 1000;

    public static boolean checkRateLimit(String clientId) {

        clients.putIfAbsent(clientId, new TokenBucket(LIMIT));

        TokenBucket bucket = clients.get(clientId);

        if (bucket.tokens > 0) {
            bucket.tokens--;
            return true;
        }

        return false;
    }

    public static void main(String[] args) {

        System.out.println(checkRateLimit("abc123"));
        System.out.println(checkRateLimit("abc123"));
    }
}
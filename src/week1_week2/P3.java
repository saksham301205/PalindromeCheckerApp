package week1_week2;

import java.util.*;

class Entry{
    String ip;
    long expiry;

    Entry(String ip,long ttl){
        this.ip=ip;
        this.expiry=System.currentTimeMillis()+ttl;
    }
}

public class P3 {

    static HashMap<String,Entry> cache = new HashMap<>();

    public static String resolve(String domain){

        if(cache.containsKey(domain)){

            Entry e = cache.get(domain);

            if(System.currentTimeMillis()<e.expiry){
                return "Cache HIT "+e.ip;
            }
        }

        String ip="172.217.14."+new Random().nextInt(255);

        cache.put(domain,new Entry(ip,300000));

        return "Cache MISS "+ip;
    }

    public static void main(String[] args) {

        System.out.println(resolve("google.com"));
        System.out.println(resolve("google.com"));

    }
}
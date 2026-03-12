package week1_week2;

import java.util.*;

public class P2 {

    static HashMap<String,Integer> stock = new HashMap<>();

    public static void purchase(String product){

        int s = stock.get(product);

        if(s>0){
            stock.put(product,s-1);
            System.out.println("Purchase successful. Remaining "+(s-1));
        }
        else{
            System.out.println("Out of stock");
        }
    }

    public static void main(String[] args) {

        stock.put("IPHONE15",100);

        purchase("IPHONE15");
        purchase("IPHONE15");

    }
}
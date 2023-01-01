package HASHING;

import java.util.HashMap;
import java.util.Hashtable;

public class hashing {
    public static void main(String[] args) {
        System.out.println("[ INFO ] HASHMAP...");
        HashMap<String,Integer> hashMap = new HashMap<>();
        hashMap.put("Islamabad", 350);
        hashMap.put("Attock", 450);
        hashMap.put("Kamra", 250);
        hashMap.put("Kamra", 788909);
        System.out.println("keys: "+hashMap.keySet());
        System.out.println("Values: "+hashMap.values());
        System.out.println(hashMap);
        System.out.println(hashMap.get("Attock"));
        System.out.println("[ INFO ] HASHTABLE...");
        Hashtable<String,Integer> hashtable = new Hashtable<>();
        hashtable.put("IU", 550);
        hashtable.put("QG", 450);
        hashtable.put("PZ", 350);
        hashtable.put("PZ", 4556);
        System.out.println(hashtable);
        System.out.println("keys: "+hashtable.keySet());
        System.out.println("Values: "+hashtable.values());
        System.out.println(hashtable);
        System.out.println(hashtable.get("PZ"));

    }
}

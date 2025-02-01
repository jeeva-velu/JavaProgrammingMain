package collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapIterationDemo {
    public static void main(String[] args) {
        HashMap<String,String> countryMap = new HashMap<>();
        countryMap.put("India","Delhi");
        countryMap.put("USA","Washington");
        countryMap.put("France","Paris");
        approach3(countryMap);
    }
    public static void approach1(HashMap<String, String> countryMap){

        //Iterating HashMap using for-each loop and keySet()--Iteration only using Keys...

        Set<String> keys = countryMap.keySet();

        /*for(String key:keys){
            String capital = countryMap.get(key);
            System.out.println(key+":"+capital);
        }*/

        //Other approach using iterator method...

        Iterator<String> iterator = keys.iterator();

        while (iterator.hasNext()){
            String key = iterator.next();
            String capital = countryMap.get(key);
            System.out.println(key+":"+capital);
        }
    }

    // Approach to iterate only values not keys using for-each loop and values() method...

    public static void approach3(HashMap<String, String> countryMap){
        Collection<String> values = countryMap.values();

        for(String value:values){
            System.out.println(value);
        }
    }
}

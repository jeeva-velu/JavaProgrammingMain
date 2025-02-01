package collections;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {
        TreeMap<Integer,String> numbers = new TreeMap<>();
        numbers.put(23,"Twenty three");
        numbers.put(2,"Two");
        numbers.put(29,"Twenty nine");
        numbers.put(1,"One");

        //Iterating the TreeMap using for-each loop...TreeMap returns key-value pairs in sorted order.

        for(Map.Entry<Integer,String> entry:numbers.entrySet()){
            System.out.println(entry.getKey()+"-"+entry.getValue());
        }
    }
}

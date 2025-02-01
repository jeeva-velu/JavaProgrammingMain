package collections;

import java.util.LinkedHashMap;
import java.util.Map;
public class LinkedHashMapDemo {

    public static void main(String[] args) {
        Map<Integer,String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(3,"Three");
        linkedHashMap.put(1,"One");
        linkedHashMap.put(6,"Six");
        linkedHashMap.put(10,"Ten");

        //Iterating LinkedHashMap using for-each loop...

        for(Map.Entry<Integer,String> entry:linkedHashMap.entrySet()){
            System.out.println(entry.getKey()+"-"+entry.getValue());
        }
    }
}

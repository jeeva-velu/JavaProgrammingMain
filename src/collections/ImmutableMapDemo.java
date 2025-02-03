package collections;

import java.util.Map;
import static java.util.Map.entry;

public class ImmutableMapDemo {

    public static void main(String[] args) {

        //Map.of() method can hold only upto 10 key-value pairs....

        Map<String,Integer> stringIntegerMap = Map.of("a",1,"b",2,"c",3);
        processMap(stringIntegerMap);

        //For n number of entries in a immutable map use Map.ofEntries() method and invoke Map.entry method...

        Map<Integer,String> integerStringMap = Map.ofEntries(entry(1,"One"),
                                                                entry(2,"Two"),
                                                                entry(3,"Three"));
        processMap1(integerStringMap);
    }

    public static void processMap(Map<String,Integer> stringIntegerMap){
        for(Map.Entry<String,Integer> entry:stringIntegerMap.entrySet()){
            System.out.println(entry.getKey()+":"+entry.getValue());
        }
    }
    public static void processMap1(Map<Integer,String> integerStringMap) {
        for (Map.Entry<Integer,String> entry : integerStringMap.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }
}

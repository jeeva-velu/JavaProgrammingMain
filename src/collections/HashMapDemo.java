package collections;

import java.util.HashMap;

public class HashMapDemo {

    public static void main(String[] args) {

        //Creating object using Map implementation class HashMap.
        //We cannot create objects directly by using interface - Map...

        HashMap<String,String> countryMap = new HashMap<>();

        //Mention two data types for Key and Value...

        //Adding elements using put() method... by Key and Value.

        countryMap.put("India","Delhi");
        countryMap.put("USA","Washington");
        countryMap.put("France","Paris");
        countryMap.put(null,null);
        System.out.println(countryMap);

        //Fetching an based on the given Key...  using get() method

        System.out.println(countryMap.get("India"));

        //Removing an entry from the map using remove method and with Key...
        countryMap.remove(null);
        System.out.println(countryMap);
    }

}

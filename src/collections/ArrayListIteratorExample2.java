package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListIteratorExample2 {
    public static void main(String[] args) {
        List<String> countryNames = new ArrayList<>();
        countryNames.add("India");
        countryNames.add("Australia");
        countryNames.add("Canada");
        countryNames.add("USA");

        //Using iterator approach

        Iterator<String> iterator = countryNames.iterator();

        while(iterator.hasNext()){
           String country = iterator.next();
            System.out.println(country);
        }
    }
}

package collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListIteratorExample1 {
    public static void main(String[] args) {
        List<String> countryNames = new ArrayList<>();
        countryNames.add("India");
        countryNames.add("Australia");
        countryNames.add("Canada");
        countryNames.add("USA");

        //Iterating the elements by for each loop

        for(String country:countryNames){
            System.out.println(country);
        }
    }
}

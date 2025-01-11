package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ArrayListListIteratorExample3 {
    public static void main(String[] args) {
        List<String> countryNames = new ArrayList<>();
        countryNames.add("India");
        countryNames.add("Australia");
        countryNames.add("Canada");
        countryNames.add("USA");

        //Iterating using ListIterator approach

        ListIterator<String> listIterator = countryNames.listIterator();

        while(listIterator.hasNext()){                  //Traverse and prints in forward direction
            String country = listIterator.next();
            System.out.println(country);
        }
        System.out.println();
        while (listIterator.hasPrevious()){
            String reverseCountry = listIterator.previous();
            System.out.println(reverseCountry);
        }
    }
}

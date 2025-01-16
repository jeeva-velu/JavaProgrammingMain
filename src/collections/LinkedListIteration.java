package collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedListIteration {
    public static void main(String[] args) {
        LinkedList<String> countryNames = new LinkedList<>();

        //Adding elements to the LinkedList

        countryNames.add("India");
        countryNames.add("USA");
        countryNames.add("UK");
        countryNames.add("Australia");
        System.out.println(countryNames);

        //Iteration using for-each loop

        for(String countryNameTemperory:countryNames){
            System.out.println(countryNameTemperory.toUpperCase());
        }

        //Iteration using Iterator

        Iterator<String> iterator = countryNames.iterator();

        while(iterator.hasNext()){
            String countryName = iterator.next();
            System.out.println(countryName.toLowerCase());
        }

        //Using iterator we can get only forward directed list.To get reverse directed list use ListIterator.

        ListIterator<String> listIterator = countryNames.listIterator();

        while (listIterator.hasPrevious()){
            String countryName = listIterator.previous();
            System.out.println(countryName);
        }
    }
}

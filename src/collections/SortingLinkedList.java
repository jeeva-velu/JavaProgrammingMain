package collections;

import java.util.LinkedList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> numbers = new LinkedList<>();
        numbers.add(3);
        numbers.add(1);
        numbers.add(10);
        numbers.add(5);
        numbers.add(-3);
        numbers.add(56);
        numbers.add(12);
        System.out.println(numbers);

        //Using collection class and sort method for ascending order

        Collections.sort(numbers);
        System.out.println(numbers);

        //Using same method and invoking comparator interface for descending order

        Collections.sort(numbers, Comparator.reverseOrder());
        System.out.println(numbers);

        //Sorting strings and characters

        var countries = new LinkedList<String>();
        countries.add("India");
        countries.add("Usa");
        countries.add("Canada");
        countries.add("Russia");

        //Ascending order

        Collections.sort(countries);
        System.out.println(countries);

        //Descending order

        Collections.sort(countries,Comparator.reverseOrder());
        System.out.println(countries);
    }
}

package collections;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
    public static void main(String[] args) {

        //Approaches to create LinkedList object

        LinkedList<Integer> nums = new LinkedList<>();
        LinkedList<String> countryNames = new LinkedList<>();
        var numbers = new LinkedList<Integer>();

        //Adding elements to the LinkedList

        countryNames.add("India");
        countryNames.add("USA");
        countryNames.add("UK");
        countryNames.add("Australia");
        System.out.println(countryNames);

        //Replacing an element using set method

        countryNames.set(3,"Pakistan");
        System.out.println(countryNames);

        //Removing an element using remove method.It removes the first occurrence

        countryNames.remove("UK");
        System.out.println(countryNames);

        //Applying sequenced collection methods--These methods are available only after Java 21 in SequencedCollection Interface

        String firstElement = countryNames.getFirst();
        System.out.println(firstElement);
        String lastElement = countryNames.getLast();
        System.out.println(lastElement);

        //To reverse the LinkedList

        //LinkedList<String> reversedCountryNames = countryNames.reversed(); reversed method available after Java21

        //Reversing manually

        LinkedList<String> reversedCountryNames = new LinkedList<>(countryNames);
        Collections.reverse(reversedCountryNames);
        System.out.println(reversedCountryNames);
    }
}

package collections;

import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
    public static void main(String[] args) {

        //Approaches to create LinkedList object

        LinkedList<Integer> nums = new LinkedList<>();
        List<String> countryNames = new LinkedList<>();
        var numbers = new LinkedList<Integer>();

        //Adding elements to the LinkedList

        countryNames.add("India");
        countryNames.add("USA");
        countryNames.add("UK");
        countryNames.add("Australia");
        System.out.println(countryNames);
    }
}

package collections;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {

    public static void main(String[] args) {
        Set<String> visitedCountries = new HashSet<>();
        visitedCountries.add("India");
        visitedCountries.add("UK");
        visitedCountries.add("USA");
        visitedCountries.add("UK");

        //Set does not allows duplicates...If we return countries it does not return duplicates...

        System.out.println(visitedCountries.size());        //It returns only 3
        System.out.println(visitedCountries);

        //To validate whether an element is presented in the HashSet using contains() method...

        boolean isIndiaAvailable = visitedCountries.contains("India");
        System.out.println(isIndiaAvailable);

        //To remove an element using remove() method...

        visitedCountries.remove("UK");
        System.out.println(visitedCountries);


    }

}

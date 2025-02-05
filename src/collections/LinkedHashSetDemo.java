package collections;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        var countries = new LinkedHashSet<String>();
        countries.add("India");
        countries.add("USA");
        countries.add("Germany");
        System.out.println(countries);

        //Iterating and printing using for loop...

        for(String visitedCountries:countries){
            System.out.println(visitedCountries);
        }

        //You can also use SequencedSet methods...

        //SequencedSet<String> reversedCountries = countries.reversed();
    }
}

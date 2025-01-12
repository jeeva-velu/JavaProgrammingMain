package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayVsArrayList {
    public static void main(String[] args) {
        List<String> countryNames = new ArrayList<>();
        countryNames.add("India");
        countryNames.add("Australia");
        countryNames.add("Canada");
        countryNames.add("USA");

        //Converting ArrayList to Array

        String[] countries = countryNames.toArray(new String[countryNames.size()]);
        System.out.println(Arrays.toString(countries));

        //Converting Array to ArrayList

        List<String> newList = Arrays.asList(countries);
        System.out.println(newList);
    }
}

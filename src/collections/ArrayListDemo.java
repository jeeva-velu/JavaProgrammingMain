package collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

    public static void main(String[] args) {

        //Creation of objects using ArrayList class

        ArrayList<Integer> nums = new ArrayList<Integer>();
        ArrayList<Double> values = new ArrayList<Double>();
        List<Character> characters = new ArrayList<Character>();
        var numbers = new ArrayList<Integer>();     //Code simplicity

        //Invoking methods

        List<String> countryNames = new ArrayList<String>();

        //Adding elements to the list countryNames

        countryNames.add("India");
        countryNames.add("USA");
        countryNames.add("England");
        countryNames.add("Germany");
        countryNames.add("India");      //List allows duplicates
        System.out.println(countryNames);

        //Inserting an element at an specified index

        countryNames.add(1,"Australia");
        System.out.println(countryNames);

        //Replacing an element with a new element using set() method

        countryNames.set(3,"Scotland");
        System.out.println(countryNames);   //England to Scotland

        //To remove an element from the list using index

       /* countryNames.remove(5);
        System.out.println(countryNames);
        */

        //Another way to remove by giving the element directly

        countryNames.remove("India");       //It removes first occurrence of the element in the list
        System.out.println(countryNames);

        //Accessing an element using get() method

        String randomElement = countryNames.get(2);
        System.out.println("The second element is "+countryNames);

        //We can use getFirst() and getLast() method for accessing first and last element

        /*To remove all the elements and to make list size 0 use clear() method

        countryNames.clear();
        System.out.println(countryNames.size());
        */

        //To reverse the list or arrayList catch the reversed elements in a new list or arrayList

        //List<String> reversedCountryNames = countryNames.reversed();

    }
}

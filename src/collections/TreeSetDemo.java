package collections;

import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("India");
        treeSet.add("USA");
        treeSet.add("Germany");

        //TreeSet always returns in a natural sorted order by default...

        System.out.println(treeSet);

        //To remove an element using remove() method...

        treeSet.remove("USA");
        System.out.println(treeSet);

        //TO return the size of TreeSet using size()...

        System.out.println("Size of the TreeSet is : "+ treeSet.size());

        //To check whether an element is available in the TreeSet using contains()...

        boolean isAvailable = treeSet.contains("India");
        System.out.println("Is the element India available : "+isAvailable);

        //To return the first element using first() method...

        String firstElement = treeSet.first();
        System.out.println("The element of the treeSet is : "+firstElement);

        //Last element-last()

        System.out.println("The last element :"+treeSet.last());
    }
}

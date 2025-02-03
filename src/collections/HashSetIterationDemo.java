package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetIterationDemo {
    public static void main(String[] args) {
        Set<String> superPowers = new HashSet<>();
        superPowers.add("Invisibility");
        superPowers.add("Mind Reading");
        superPowers.add("Zone Changing");
        superPowers.add("Time Travel");

        //Approach1 using for-each loop...

        for(String power:superPowers){
            System.out.println(power.toUpperCase());
        }

        //Approach2 using iterator() method by creating Iterator object...
        
        Iterator<String> iterator = superPowers.iterator();

        while(iterator.hasNext()){
            String power = iterator.next();

            System.out.println(power.toLowerCase());
        }
    }
}

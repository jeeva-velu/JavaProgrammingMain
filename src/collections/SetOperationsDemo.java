package collections;

import java.util.HashSet;
import java.util.Set;

public class SetOperationsDemo {

    public static void main(String[] args) {
        Set<Integer> hashSet1 = new HashSet<>();
        hashSet1.add(7);
        hashSet1.add(4);


        Set<Integer> hashSet2 = new HashSet<>();
        hashSet1.add(8);
        hashSet1.add(2);

        //Using these two set objects we perform various Set operations...

        // 1.Union operation--addAll() method is used...
        //  hashSet1.addAll(hashSet2);

        //2.Intersection operation--retainAll() method is used...
        //hashSet1.retainAll(hashSet2);

        //3.Difference operation--removeAll() method is used.Uncommon element from hashSet1 is returned...
        //hashSet1.removeAll(hashSet2);

        //Subset operation--containsAll()

        boolean isTrue = hashSet1.containsAll(hashSet2);
        System.out.println(isTrue);

        System.out.println(hashSet1);
    }
}

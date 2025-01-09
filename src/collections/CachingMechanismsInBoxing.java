package collections;

public class CachingMechanismsInBoxing {
    public static void main(String[] args) {

        /*Caching mechanisms is available only for numerical wrapper classes
        Byte,Short,Integer,Long
        Values lying in the range -128 to 127 and the objects having same values. JVM does not create
        new memory locations for the new objects.
        All the objects value within the range -128 to 127 and the objects having same values is stored
        in the same memory location.
         */

        Integer obj1 = 16;
        Integer obj2 = 16;
        System.out.println(obj1==obj2); //true

        Integer obj3 = 130;
        Integer obj4 = 130;
        System.out.println(obj3==obj4); //false

        /*This mechanism is applicable only for Autoboxing and valueOf() method. Not for deprecated constructor.

        Integer obj5 = new Integer(16);
        Integer obj6 = new Integer(16);
        System.out.println(obj5==obj6);  false

         */
    }
}

package collections;

public class AutoboxingUnboxingDemo {

    public static void main(String[] args) {

        //Autoboxing--Directing converting primitive data type to wrapper class obj without using manual valueOf() method

        int num = 10;
        Integer integerObj = num;   //Wrapped directly int value to integerObj wrapper class
        Double doubleObj = 3.14;    //Wrapped
        Character charObj = 'j';
        
        //Unboxing

        int num1 = integerObj;
        double d1 = doubleObj;
        char alphabet = charObj;
        System.out.println(num1);
        System.out.println(d1);
        System.out.println(alphabet);

    }

}

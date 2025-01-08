package collections;

public class UnboxingDemo {
    public static void main(String[] args) {

        //Unboxing-It is the process of converting wrapped class obj to unwrapped primitive type

        int num1 = 10;
        Integer integerObj = Integer.valueOf(num1);     //Wrapped

        //To unwrap

        int num2 = integerObj.intValue();               //Unwrapped
        System.out.println(num2);

        double d1 = 3.14;
        Double doubleObj = Double.valueOf(d1);          //Wrapped

        double d2 = doubleObj.doubleValue();            //Unwrapped
        System.out.println(d2);
    }
}

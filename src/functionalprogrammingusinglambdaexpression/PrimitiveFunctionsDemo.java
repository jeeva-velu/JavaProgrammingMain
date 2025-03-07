package functionalprogrammingusinglambdaexpression;

import java.util.function.DoublePredicate;
import java.util.function.IntPredicate;
import java.util.function.LongPredicate;

public class PrimitiveFunctionsDemo {

    public static void main(String[] args) {

        //Always use primitive function interfaces when we deal with primitive data type values...

        IntPredicate checkNumber = num -> num % 2 == 0;
        System.out.println(checkNumber.test(10)); //true

        DoublePredicate checkDoubleValueGreaterThan50 = num -> num  >= 50.0;
        System.out.println(checkDoubleValueGreaterThan50.test(35.0));   //false

        LongPredicate checkLongValueGreaterThan100 = num -> num >= 1000000;
        System.out.println(checkLongValueGreaterThan100.test(2000000000));  //true

    }

}

package functionalprogrammingusinglambdaexpression;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateDemo {
    public static void main(String[] args) {

        Predicate<Integer> isEven = (num) -> num%2==0;  //Creating Predicate interface and writing Lambda exp to it.
        boolean check = isEven.test(10);        //Invoking the test method available in Predicate interface.
        System.out.println(check);
        System.out.println(isEven.test(13));

        Predicate<Integer> numGreater = num -> num>50;  //U can also don't want to mention parenthesis for single input parameter.
        boolean isGreater = numGreater.test(53);
        System.out.println(isGreater);

        //To check the number is even and the number is greater than 50...Chaining your multiple predicate conditions using and default method in the Predicate.

        Predicate<Integer> isEvenAndIsGreaterThan50 = (num) -> num%2==0 & num>50;
        boolean checkEvenAndGreater = isEvenAndIsGreaterThan50.test(55);
        System.out.println(checkEvenAndGreater);

        //Otherwise we can do in another approach using and() method available in Predicate interface...

        boolean isTrue = isEven.and(numGreater).test(62);
        System.out.println("Number is even and greater than 50 "+isTrue);

        //Using or() method.It returns true if either one condition is true...

        System.out.println("The number is either even or greater than 50 "+isEven.or(numGreater).test(55));

        //Using the negate() default method-It gives the result vice versa.

        System.out.println("2 is even but negate() method gives as "+isEven.negate().test(2));

        //Using the not() static method which changes the behaviour of the predicate condition vice versa.

        Predicate<Integer> isOdd = Predicate.not(isEven);
        boolean notPower = isOdd.test(3);
        System.out.println(notPower);

        //Using the isEquals() static method...

        Predicate<String> isEqual = Predicate.isEqual("Jeeva");
        System.out.println(isEqual.test("Harsha"));

        //Using Predicate in real-time example...

        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        //To filter the even numbers from the list...
        List<Integer> evenList = list.stream().filter(isEven).collect(Collectors.toList());  //Collecting a list of new elements in a new list.
        System.out.println(evenList);
    }
}

package functionalprogrammingusinglambdaexpression;

import java.util.function.Function;

public class FunctionDemo {

    public static void main(String[] args) {
        Function<String,String> convertString = (input) -> input.toUpperCase(); //Input and Output are of same data type.
        String convertedString = convertString.apply("Jeeva");    //Assigning the output using the apply() method to a new String object.
        System.out.println(convertedString);

        //Getting the length of the string...

        Function<String,Integer> lengthString= (input) -> input.length();
        int lenghtOfString = lengthString.apply("Jeeva");
        System.out.println(lenghtOfString);

        //Using the identity() static method in Function interface... Use this method where you want to return same input value as output..

        Function<String,String> sameInputAsOutput = Function.identity();
        System.out.println("Returns same i/p as o/p : "+sameInputAsOutput.apply("Harsha"));

        //Using two default methods compose() and andThen().

        Function<Integer,Integer> doubleValue = num -> num * 2;
        Function<Integer,Integer> addThree = num -> num + 3;

        //Chaining the LambdaExpressions using the default methods...

        Function<Integer,Integer> output1 = doubleValue.andThen(addThree);  //First left LambdaExp will be executed and then right LambdaExp will be executed.
        System.out.println(output1.apply(5));   //13
        Function<Integer,Integer> output2 = doubleValue.compose(addThree);  //First right LambdaExp will be executed and then left LambdaExp will be executed.
        System.out.println(output2.apply(5));   //16

    }
}

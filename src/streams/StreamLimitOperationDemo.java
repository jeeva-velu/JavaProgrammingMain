package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class StreamLimitOperationDemo {
    public static void main(String[] args) {

        List<String> departmentList = new ArrayList<>();
        departmentList.add("Cse");
        departmentList.add("Ece");
        departmentList.add("Cs");
        departmentList.add("Bme");

        //Step:1 Converting collection object to Stream object.

        departmentList.stream()
                .limit(2)   //Using limit intermediate operation to process only first 2 elements of the stream.
                .map(word -> word.toUpperCase())    //Then using map operation to process the elements received after applying the limit operation.
                .forEach(System.out::println);  //Finally using termination operation to print the received o/p stream.

        Stream.generate(new Random()::nextInt)  //It generates an infinite stream of integers.
                .limit(10)              //Setting the limit for processing only the first 10 elements of the stream.
                .map(num -> num*2)       //Using another intermediate operation to process the caught elements.
                .forEach(System.out::println);
    }
}

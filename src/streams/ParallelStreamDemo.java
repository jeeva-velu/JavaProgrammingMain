package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ParallelStreamDemo {
    public static void main(String[] args) {

        List<String> departmentList = new ArrayList<>();
        departmentList.add("CSE");
        departmentList.add("IT");
        departmentList.add("ECE");
        departmentList.add("BME");


        //Invoking the parallelStream method using the collection object.Performance very fast compared to normal stream.

        departmentList.parallelStream().forEach(System.out::println);

        //Invoking iterate method in Stream class to generate 100 numbers to avoid manual entries.

        Stream<Integer> numStream = Stream.iterate(1, num -> num + 1).limit(100);

        //First processing it by normal stream.

        long startTime = System.currentTimeMillis();
        System.out.println(numStream.map(num -> {
                    try {
                        Thread.sleep(100);  //Making my compiler intentionally to delay to show diff b/w normal stream and parallelStream.
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    return num * 2;
                        })
                        .collect(Collectors.toList())
        );

        long endTime = System.currentTimeMillis();
        System.out.println(endTime-startTime);

        //Normal stream takes 11177 milliseconds to complete execution

        Stream<Integer> numberStream = Stream.iterate(1, num -> num + 1).limit(100).parallel();

        //First processing it by normal stream.

        long startingTime = System.currentTimeMillis();
        System.out.println(numStream.map(num -> {
                            try {
                                Thread.sleep(100);  //Making my compiler intentionally to delay to show diff b/w normal stream and parallelStream.
                            } catch (InterruptedException e) {
                                throw new RuntimeException(e);
                            }
                            return num * 2;
                        })
                        .collect(Collectors.toList())
        );

        long endingTime = System.currentTimeMillis();
        System.out.println(endingTime-startingTime);

        //Parallel stream just takes 1500 milliseconds to execute the code.

    }
}

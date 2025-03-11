package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamCreationDemo {

    public static void main(String[] args) {

        // 1.Create a Collection object from which Stream can be created...

        List<String> departmentList = new ArrayList<>();
        departmentList.add("CSE");
        departmentList.add("IT");
        departmentList.add("ECE");
        departmentList.add("BME");

        // 2.Creating a stream from collection object departmentList.
        //Catching all the stream of elements in a Stream object depStream.

        Stream<String> depStream = departmentList.stream();

        //My requirement is to print all department.Using forEach method available in Consumer interface and by writing Lambda expression to print each department.

        depStream.forEach(department -> System.out.println(department));
        //depStream.forEach(System.out::println); //This is method reference approach to avoid LambdaExpression.

        // Another approach for creating stream...

        Stream<String> inputStream = Stream.of("Jeeva","Harsha","Neema");
        inputStream.forEach(System.out::println);

        //We also have parallelStream method which iterates the elements in the Collection object parallel to increase performance.

        Stream<String> parallelStream = departmentList.parallelStream();
        parallelStream.forEach(department -> System.out.println(department));
    }

}

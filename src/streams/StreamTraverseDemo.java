package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamTraverseDemo {
    public static void main(String[] args) {
        List<String> departmentList = new ArrayList<>();
        departmentList.add("Cse");
        departmentList.add("Ece");
        departmentList.add("Cs");
        departmentList.add("Bme");

        //We can traverse the Stream object only once.

        Stream<String> depStream = departmentList.stream();
        depStream.forEach(System.out::println);
        //depStream.forEach(System.out::println); - throws an error.
    }
}

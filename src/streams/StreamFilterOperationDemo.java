package streams;

import java.util.ArrayList;
import java.util.List;

public class StreamFilterOperationDemo {

    public static void main(String[] args) {

        List<String> departmentList = new ArrayList<>();
        departmentList.add("Cse");
        departmentList.add("Ece");
        departmentList.add("Cs");
        departmentList.add("Bme");

        //Step:1 Converting collection object to Stream object.

        departmentList.stream()
                .map(word -> word.toUpperCase())//This is first intermediate operation which apply the condition to all elements.
                .filter(word -> word.startsWith("C"))   //Step:2-Intermediate operation to filter the words starts with C ,and it returns a new stream.
                .forEach(System.out::println);  //Step:3-Termination operation which takes the o/p stream returned by the intermediate operation and display.

    }

}

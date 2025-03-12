package streams;

import java.util.ArrayList;
import java.util.List;

public class StreamMapOperationDemo {
    public static void main(String[] args) {

        //Achieving the Stream pipeline successfully.

        List<String> departmentList = new ArrayList<>();
        departmentList.add("CSE");
        departmentList.add("IT");
        departmentList.add("ECE");
        departmentList.add("BME");

        //Step:1 Create a Stream object from the Collection object.Use stream() if you want to process the Collection elements sequentially.Else use parallelStream() to process your elements parallel.
        //Step:2 Use the intermediate operation map() to process all elements one by one on giving a Lambda Expression as an argument to it.Once after processing the result is received in a new stream.
        //Step:3 Once after completing the intermediate operation use termination operation forEach() to display the results.

        departmentList.stream()                            //Creation of Stream object from Collection object.
                .map(word -> word.toLowerCase())    //Intermediate method 1.
                .map(word -> "Hi "+word)            //Intermediate method 2.
                .forEach(word -> System.out.println(word)); //Termination method.

    }
}

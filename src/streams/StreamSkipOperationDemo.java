package streams;

import java.util.stream.Stream;

public class StreamSkipOperationDemo {
    public static void main(String[] args) {

        Stream.iterate(1,n->n+1)    //Generates an infinite stream starts with seed value 1 and increments by 1 each time.
                .skip(5)    //First intermediate operation.It skips the first 5 elements in the stream.
                .limit(5)   //Second intermediate operation.It processes only five 5 elements in the stream.
                .forEach(System.out::println);  //Termination operation to display the results.

    }
}

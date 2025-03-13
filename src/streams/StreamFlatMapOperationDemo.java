package streams;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamFlatMapOperationDemo {

    public static void main(String[] args) {
        //Creating an String array...

        String[] arrayOfWords = {"Jeeva", "Handsome"};

        //Converting the array object into a stream object using stream() static method available in Arrays class...

        Stream<String> streamOfWords = Arrays.stream(arrayOfWords);

        //Using an intermediate operation map() to convert the elements available in the stream object as a charArray...
        //Splitting the word using split() method available in String class and catching them in a Stream object...

        Stream<String[]> streamOfLetters = streamOfWords.map(word -> word.split(""));   //This stream object contains stream of letters.

        //Using flatMap() for making the array into normal stream object.

        streamOfLetters.flatMap(Arrays::stream).forEach(System.out::println);


    }

}

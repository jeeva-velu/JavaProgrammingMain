package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamReduceOperationDemo {
    public static void main(String[] args) {

        List<String> departmentList = new ArrayList<>();
        departmentList.add("Cse");
        departmentList.add("Ece");
        departmentList.add("Cs");
        departmentList.add("Bme");

        System.out.println(departmentList.stream().count());    //4


        //To use this reduce operation our stream is to be IntStream,DoubleStream,LongStream.

        List<Integer> numberList = List.of(1,2,3,4,5);
        int sum = numberList.stream()
                .reduce(0,Integer::sum);
        System.out.println(sum);    //15

        int result = numberList.stream()
                .filter(num -> num%2==0)
                .mapToInt(num -> num).sum();
        System.out.println(result);
    }
}

package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamCollectOperationsDemo {
    public static void main(String[] args) {
        List<String> departmentList = new ArrayList<>();
        departmentList.add("CSE");
        departmentList.add("IT");
        departmentList.add("ECE");
        departmentList.add("BME");

        List<String> newDepartmentList = departmentList.stream()    //Catching the o/p in new collection object.
                .filter(word -> word.startsWith("C"))
                .collect(Collectors.toList());  //collect() invokes the Collectors utility class and static method toList() to convert the Stream object into new List or collection object.
        newDepartmentList.forEach(System.out::println);     //It is not called as an terminal operation because terminal operation can be used only in streams.

        long countOfDepStartsWithC = departmentList.stream()
                .filter(word -> word.startsWith("C"))
                .collect(Collectors.counting());  //collect() invokes the Collectors utility class and static method toList() to convert the Stream object into new List or collection object.
        System.out.println(countOfDepStartsWithC);

    }
}

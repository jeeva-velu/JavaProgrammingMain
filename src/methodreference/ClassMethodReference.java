package methodreference;


import java.util.List;

public class ClassMethodReference {

    public static void main(String[] args) {

        var list = List.of("Hello","Hi","How","Are","You");
        list.forEach(words -> System.out.println(words));

        //Using method reference we can do the same logic...

        list.forEach(System.out::println);  //This is even shorter and precised than using normal lambda expression.

    }

}

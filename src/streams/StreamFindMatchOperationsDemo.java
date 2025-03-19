package streams;

import java.util.List;
import java.util.Optional;

public class StreamFindMatchOperationsDemo {
    public static void main(String[] args) {

        List<Item> items = getItems();

        //1.allMatch()

        boolean allInStock = items.stream().allMatch(Item::isInStock);  //Returns true if all items are in stock.
        System.out.println("All the items are in stock : "+allInStock); //false

        //2.anyMatch()

        boolean anyInStock = items.stream().anyMatch(Item::isInStock);  //Returns true if any one item is in stock.
        System.out.println("Any item is in stock? : "+anyInStock); //true

        //3.noneMatch()

        boolean noneMatchPrice = items.stream().noneMatch(item -> item.getPrice()>10000);  //Returns true only none of the element matches with the given predicate condition.
        System.out.println("None of the item is above 10000? : "+noneMatchPrice);  //true;

        //4.Optional<T> findAny()

        Optional<Item> randomItemOptional = items.stream().filter(item -> item.getPrice()>6000).findAny();
        //Returns the item details if any element matches with the predicate condition.
        System.out.println(randomItemOptional);

        //5.Optional<T> findFirst()

        Optional<Item> findFirstOptional = items.stream().findFirst();
        System.out.println(findFirstOptional);  //Returns the details of first item in the stream.

    }

    private static List<Item> getItems(){
        return List.of(
                new Item("Lap",5469.4,true,false),
                new Item("Phone",1254.8,true,true),
                new Item("Headphone",5000.0,false,false),
                new Item("Speaker",6000.0,true,true),
                new Item("PC",7000.0,true,false)
        );
    }
}

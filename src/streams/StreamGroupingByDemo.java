package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamGroupingByDemo {
    public static void main(String[] args) {

        List<Product> productList = Arrays.asList(new Product("Apple",1500),
                new Product("Mi",1000),new Product("Vivo",1200),
                new Product("Oppo",900));

        Map<Integer,List<Product>> groupingByPriceMap = productList.stream()
                .collect(Collectors.groupingBy(Product::getPrice));

        System.out.println(groupingByPriceMap);

    }
}

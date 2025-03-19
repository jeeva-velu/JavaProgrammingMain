package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamPartitioningDemo {
    public static void main(String[] args) {
        List<Product> productList = Arrays.asList(new Product("Apple",1500),
                new Product("Mi",1000),new Product("Vivo",1200),
                new Product("Oppo",900));

        //It partitions by returning true for the products that are above 1000 and false for below 1000.

        Map<Boolean,List<Product>> partitioningByPriceMap = productList.stream()
                .collect(Collectors.partitioningBy(product -> product.getPrice()>1000));

        System.out.println(partitioningByPriceMap);
    }
}

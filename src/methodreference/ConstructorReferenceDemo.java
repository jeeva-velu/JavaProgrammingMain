package methodreference;

public class ConstructorReferenceDemo {
    public static void main(String[] args) {
        ProductInterface productInterface = (name,price) -> new Product(name,price);
        System.out.println(productInterface.getProduct("iPhone",50000));

        //It can also be done using Constructor Reference...

        ProductInterface productInterface1 = Product::new;
        System.out.println(productInterface1.getProduct("RedMi",20000));
    }
}

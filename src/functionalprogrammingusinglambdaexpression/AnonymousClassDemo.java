package functionalprogrammingusinglambdaexpression;

//We can use anonymous class instead of Lambda exp to pass behaviour into the methods too...

public class AnonymousClassDemo {
    public static void main(String[] args) {
        Hello hello = new Hello() {             //This is the class without the class name...
            @Override
            public void sayHello() {
                System.out.println("Anonymous");
            }
        };
        process(hello);
    }



    public static void process(Hello h){
        h.sayHello();
    }
}

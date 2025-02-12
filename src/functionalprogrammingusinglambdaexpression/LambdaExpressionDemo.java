package functionalprogrammingusinglambdaexpression;

public class LambdaExpressionDemo {
    public static void main(String[] args) {

        Hello hello = () -> System.out.println("Hello");    //Creating the datatype of Hello interface and invoking the method signature...
        Hello hello1 = () -> System.out.println("Hello World");
        process(hello);     //Inside the process() method i am passing the business logic of hello datatype
        process(hello1);
    }

    public  static void process(Hello h){           //Creating the datatype of Hello interface...
        h.sayHello();                               //Invoking the sayHello() method from Hello interface using the datatype..
    }
}

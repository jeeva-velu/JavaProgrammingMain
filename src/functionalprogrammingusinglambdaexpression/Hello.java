package functionalprogrammingusinglambdaexpression;

@FunctionalInterface                //Once we mention this annotation we cannot alter the interface by adding or deleting the abstract methods more than one
public interface Hello {

    void sayHello();                //This is an abstract method in an interface...

}

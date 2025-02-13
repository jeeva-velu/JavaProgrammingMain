package functionalprogrammingusinglambdaexpression;

@FunctionalInterface
public interface ArithmeticOperation {

    int operation(int num1,int num2);           //It is optional to mention access modifier in an abstract method.

}

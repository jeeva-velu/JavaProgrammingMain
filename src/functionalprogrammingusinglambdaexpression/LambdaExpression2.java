package functionalprogrammingusinglambdaexpression;

public class LambdaExpression2 {
    public static void main(String[] args) {

        ArithmeticOperation addition = (a,b) -> {
            int result = a+b;
            return result;
        };
        System.out.println("The added result is "+addition.operation(5,5));    //Invoking the operation abstract method using addition variable.

        ArithmeticOperation subtraction = (a,b) -> a-b;     //Automatically returns the subtracted result of two inputs.
        System.out.println("The subtracted result is "+subtraction.operation(10,5));

        ArithmeticOperation multiplication = (a,b) -> a-b;     //Automatically returns the multiplication result of two inputs.
        System.out.println("The multiplied result is "+multiplication.operation(10,5));

    }
}

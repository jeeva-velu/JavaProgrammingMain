package methodreference;

public class StaticMethodReference {
    public static void main(String[] args) {

        //1.Creating the lambda expression by our Custom functional interface.This is normal style of lambda expression using FI.

        ArithmeticOperation operation = (a,b) -> {
            int sum = a+b;
            System.out.println(sum);
            return sum;
        };

        operation.performOperation(3,5);

        //4.Creating Static Method Reference to achieve catching business logic of static method in a lambda expression.

        ArithmeticOperation methodReference = StaticMethodReference::performAddition;
        methodReference.performOperation(6,9);


    }
    //2.Think like in this class there is already a static method with the same lambda expression's logic.
    //3.To overcome these problem without duplicating the code we can use Static Method Reference.

    public static int performAddition(int a,int b){
        int sum = a+b;
        System.out.println(sum);
        return sum;
    }


}

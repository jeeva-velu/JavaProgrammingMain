package methodreference;

public class InstanceMethodReference {
    public static void main(String[] args) {

        //Create an object of the class to build lambda expression using instance method reference for a instance method.
        InstanceMethodReference instanceMethodReference = new InstanceMethodReference();
        ArithmeticOperation operation = instanceMethodReference::performSubtraction;
        System.out.println(operation.performOperation(10,6));
    }

    //This is an instance method logic.We have to catch this logic in the Reference to instance method logic for lambda expression.
    public int performSubtraction(int a,int b){
        int result = a-b;
        return result;
    }
}

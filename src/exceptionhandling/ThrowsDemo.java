package exceptionhandling;

public class ThrowsDemo {
    public static void main(String[] args) {
        try {               //This is the caller method of Division class and caller method handles the exception..
            Division object = new Division();
            double output = object.division("4", "0");
            System.out.println(output);
        } catch (ArithmeticException | NumberFormatException ex){
            System.out.println("Please provide valid input");
        }
    }
}

package functionalprogrammingusinglambdaexpression;

public class LexicalScopeTest {
    public static void main(String[] args) {

        String input = "Hello World";
        Printer printer = input1 -> System.out.println(input1); //We cannot use same input as a variable name in this LambdaExp because it is already declared in the method.LambdaExp do not have separate scope.
        printer.print("Jeeva is a Magician");

    }
}

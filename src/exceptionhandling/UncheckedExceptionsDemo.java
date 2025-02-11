package exceptionhandling;

public class UncheckedExceptionsDemo {
    public static void main(String[] args) {
        String name = null;             //Compiler cannot handle these exceptions..These are handled during the runtime.
        name = "Jeeva";
        name = name.toUpperCase();
        name = name.substring(1,15);
    }
}

package functionalprogrammingusinglambdaexpression;

public class ThisDemo {

    public static void main(String[] args) {

        //Invoking the non-static method by creating the object of the class...

        ThisDemo thisDemo = new ThisDemo();
        Printer lambdaPrinter = thisDemo.getLambdaPrinter();
        lambdaPrinter.print("Lambda Expression");

    }

    public Printer getLambdaPrinter(){
        Printer printer = msg -> System.out.println(msg+" : "+this.getClass()); //this.getClass() refers to the class where the LambdaExp is created.
        return printer;
    }

}

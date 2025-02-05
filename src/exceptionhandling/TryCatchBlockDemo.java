package exceptionhandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchBlockDemo {

    public static void main(String[] args) {

        //When you have an doubt of getting an exception in your code use try-catch block...
        //Write all your code in the try block...
        //In catch try to mention what exception we are targeting to handle...
        //This try-catch block is to handle InputMismatchException...

        try{
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a number:");
            //We should enter only integer value as input.If not we get InputMismatchException...
            int number = scanner.nextInt();
            System.out.println("The entered number is:"+number);
        }

        //If no exception occurs at runtime catch block will not be executed...

        catch(Exception ex){
            /*System.out.println(ex.getStackTrace());
            System.out.println("Exception handled");*/

            //For this simple program use mechanism...
            System.out.println("Please enter an valid numerical input data...");
        }
    }
}

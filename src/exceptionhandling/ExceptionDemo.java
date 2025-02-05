package exceptionhandling;

import java.util.Scanner;

public class ExceptionDemo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");

        //We should enter only integer value as input.If not we get InputMismatchException...

        int number = scanner.nextInt();
        System.out.println("The entered number is:"+number);
    }

}

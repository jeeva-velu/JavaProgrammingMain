package exceptionhandling;

import java.util.Scanner;

public class TryWithResourcesDemo {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){   //Scanner object will be automatically closed by the JVM once after the execution.
            System.out.println("Please enter a number");
            int n = sc.nextInt();
            System.out.println(n);
        }catch (Exception ex) {
            System.out.println("Please enter an numerical number");
        }
    }
}

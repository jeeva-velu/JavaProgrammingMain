
package exceptionhandling;

import java.util.Scanner;
import java.util.logging.Logger;


public class FinallyBlockDemo {
    public static void main(String[] args) {

        Scanner scan = null;

        try{
            scan = new Scanner(System.in);
            System.out.println("Please enter an number");
            int n = scan.nextInt();
            System.out.println(n);
        }catch (Exception ex){
            System.out.println("Please enter an numerical input data");
        }finally {
            System.out.println("finally block is being executed");
            if(scan != null){
                scan.close();
            }
        }
    }
}

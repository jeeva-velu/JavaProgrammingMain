package patterns;

import java.util.Scanner;

public class Pattern1 {

    static void pattern(int n){

        for(int row = 1; row <= n ; row++ ){
            for(int col = 1; col <= n+1 ; col++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        pattern(n);
    }

}



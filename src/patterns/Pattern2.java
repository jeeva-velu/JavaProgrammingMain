package patterns;

import java.util.Scanner;

public class Pattern2 {
    static void pattern2(int n){
        for(int row = 1; row <= n; row++){
            for(int col = 1; col <= (n+1-row); col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        pattern2(n);
    }
}

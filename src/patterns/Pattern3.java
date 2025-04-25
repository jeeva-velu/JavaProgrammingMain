package patterns;

import java.util.Scanner;

public class Pattern3 {

    static void pattern3(int n){
        for(int row = 1; row <= n; row++){
            for (int col = 1; col <= row; col++){
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        pattern3(n);
    }

}

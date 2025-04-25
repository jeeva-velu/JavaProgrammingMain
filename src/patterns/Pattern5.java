package patterns;

import java.util.Scanner;

public class Pattern5 {

    static void pattern5(int n){
        int totalRows = 2*n-1;

        for(int row = 1; row <= totalRows; row++){
            int stars;
            if(row <= n){
                stars = row;
            } else {
                stars = totalRows-row+1;
            }

            int spaces = n - stars;

            for(int col = 1; col <= spaces+stars; col++){
                if(col <= spaces){
                    System.out.print(" ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        pattern5(n);
    }

}

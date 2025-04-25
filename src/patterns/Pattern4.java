package patterns;

import java.util.Scanner;

public class Pattern4 {

    static void pattern4(int n){

        for (int row = 1; row <= 2*n-1; row++){
            int stars;

            if(row <= n){
                stars = row;
            } else {
                stars = 2*n-row;
            }

            for(int col = 1; col <= stars; col++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        pattern4(n);
    }

}

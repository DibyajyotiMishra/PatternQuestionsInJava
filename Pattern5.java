
/**
 * Pattern2
 */

import java.util.Scanner;

public class Pattern5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();
        sc.close();

        for (int i = n; i > 0; i--) {
            for (int j = i; j > 0; j--) {
                System.out.print("*  ");
            }
            System.out.println();
        }
    }
}
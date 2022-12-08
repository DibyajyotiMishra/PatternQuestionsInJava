
/**
 * Pattern1
 */

import java.util.Scanner;

public class Pattern1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();
        sc.close();
        for (int i = 0; i < n; i++) {
            System.out.print("*  *  *  *  *  * \n");
        }
    }
}
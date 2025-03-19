import java.util.*;

public class matrix {
    public static void main(String[] args) {
        int[][] a = {
            {1, 2}, 
            {7, 8}
        };

        int[][] b = {
            {5, 6}, 
            {7, 7}
        };

        int[][] sum = new int[2][2];

        // Adding matrices
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                sum[i][j] = a[i][j] + b[i][j];
            }
        }

        // Printing result
        System.out.println("Sum of matrices:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("  "+sum[i][j]);
            }
            System.out.println();
        }
    }
}

import java.io.*;
import java.util.*;

public class DiagonalDifference {
    private static int primaryDiagonal(int n, int[][] matrix) {
        int sum = 0;
        for(int i = 0; i < n; i++) {
            sum += matrix[i][i];
        }
        return sum;
    }
    
    private static int secondaryDiagonal(int n, int[][] matrix) {
        int sum = 0;
        for(int i = 0; i < n; i++) {
            for(int j = n - 1; j >= 0; j--) {
                if(i + j == n - 1) sum += matrix[i][j];
            }
        }
        return sum;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] matrix = new int[n][n];
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        int diff = Math.abs(primaryDiagonal(n, matrix) - secondaryDiagonal(n, matrix));
        System.out.println(diff);
        sc.close();
    }
}

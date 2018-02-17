import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MiniMaxSum {
    private static long mini(int[] a) {
        long sum = 0;
        for(int i = 0; i < 4; i++) {
            sum += a[i];
        }
        return sum;
    }

    private static long max(int[] a) {
        long sum = 0;
        for(int i = 1; i < 5; i++) {
            sum += a[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        for(int arr_i=0; arr_i < 5; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        Arrays.sort(arr);
        System.out.println(mini(arr) + " " + max(arr));
    }
}


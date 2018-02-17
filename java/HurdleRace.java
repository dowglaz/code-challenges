import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class HurdleRace {
    private static int solve(Integer[] height, int k) {
        int max = Collections.max(Arrays.asList(height));
        int diff = max - k;
        return diff > 0 ? diff : 0;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        Integer[] height = new Integer[n];
        for(int height_i=0; height_i < n; height_i++){
            height[height_i] = in.nextInt();
        }
        System.out.println(solve(height, k));
    }
}


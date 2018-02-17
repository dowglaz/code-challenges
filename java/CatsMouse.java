import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class CatsMouse {
    private static String solve(int a, int b, int c) {
        int distA = 0, distB = 0;
        distA = Math.abs(c - a);
        distB = Math.abs(c - b);
        if(distA == distB) {
            return "Mouse C";
        } else if(distA < distB) {
            return "Cat A";
        } else {
            return "Cat B";
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int i = 0; i < q; i++){
            int x = in.nextInt();
            int y = in.nextInt();
            int z = in.nextInt();
            System.out.println(solve(x, y, z));
        }
    }
}


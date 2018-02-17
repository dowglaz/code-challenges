import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BigSorting {
    private static String[] sort(String[] unsorted) {
        Arrays.sort(unsorted, new Comparator<String> () {
            public int compare(String a, String b) {
                if(a.length() > b.length()) return 1;
                if(b.length() > a.length()) return -1;
                return a.compareTo(b);
            }
        });
        return unsorted;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] unsorted = new String[n];
        for(int unsorted_i=0; unsorted_i < n; unsorted_i++){
            unsorted[unsorted_i] = in.next();
        }
        String[] sorted = sort(unsorted);
        for(int i = 0; i < unsorted.length; i++) {
            System.out.println(sorted[i]);
        }
    }
}


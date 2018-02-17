import java.io.*;
import java.util.*;

public class PlusMinus {
  private static double positives(int[] a) {
    int quantity = 0;
    for(int i = 0; i < a.length; i++) {
      if(a[i] > 0.0) quantity++;
    }
    return quantity / (double) a.length;
  }

  private static double negatives(int[] a) {
    int quantity = 0;
    for(int i = 0; i < a.length; i++) {
      if(a[i] < 0.0) quantity++;
    }
    return quantity / (double) a.length;
  }

  private static double zeroes(int[] a) {
    int quantity = 0;
    for(int i = 0; i < a.length; i++) {
      if(a[i] == 0.0) quantity++;
    }
    return quantity / (double) a.length;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] a = new int[n];
    for(int i = 0; i < n; i++ ){
      a[i] = sc.nextInt();
    }
    System.out.println(positives(a));
    System.out.println(negatives(a));
    System.out.println(zeroes(a));
  }
}

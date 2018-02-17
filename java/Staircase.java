import java.io.*;
import java.util.*;

public class Staircase {
  private static void staircase(int n) {
    for(int i = n - 1; i >= 0; i--) {
      for(int j = 0; j < n; j++) {
        if(j >= i) System.out.print("#");
        else System.out.print(" ");
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    staircase(n);
  }
}

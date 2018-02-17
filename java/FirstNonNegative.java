import java.util.*;

public class FirstNonNegative {
    public int solution(int[] A) {
        int[] slots = new int[A.length + 1];

        for(int i = 0; i < A.length; i++) {
            if(A[i] > 0 && A[i] <= A.length) {
                slots[A[i] - 1] = A[i];
            }
        }

        for(int i = 0; i < A.length; i++) {
            if(slots[i] == 0) return i + 1;
        }

        return A.length + 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int[] a = new int[l];
        for(int i = 0; i < l; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println(new FirstNonNegative().solution(a));
    }
}

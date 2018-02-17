import java.util.*;

public class FirstNonNegative {
    private void printList(List<?> list) {
        for(Object e : list) { System.out.print(e + ", "); };
        System.out.println("\n");
    }

    public int solution(int[] A) {
        int firstNonNull = 0;
        List<Integer> empties = new ArrayList<Integer>(A.length + 1);
        for(int i = 0; i <= A.length; i++) {
            empties.add(i + 1);
        }
        for(int i = 0; i < A.length; i++) {
            if(A[i] > 0 && A[i] <= A.length) {
                empties.set(A[i] - 1, null);
                if(empties.get(A[i]) != null) firstNonNull = A[i];
            }
        }
        System.out.println(firstNonNull);
        printList(empties);
        return empties.get(firstNonNull);
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

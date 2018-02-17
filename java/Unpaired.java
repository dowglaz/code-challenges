import java.util.*;

public class Unpaired {
    public int solution(int[] A) {
        Set<Integer> set = new HashSet<Integer>();
        for(int i = 0; i < A.length; i++) {
            if(set.contains(A[i])) {
                set.remove(A[i]);
            } else {
                set.add(A[i]);
            }
        }
        for(Integer i : set) return i;
        // should never happen
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for(int i = 0; i < n; i++) array[i] = sc.nextInt();
        System.out.println(new Unpaired().solution(array));
    }
}

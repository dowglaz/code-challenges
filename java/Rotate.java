import java.util.*;

public class Rotate {
    public int[] solution(int[] A, int K) {
        int[] answer = new int[A.length];
        for(int i = 0; i < A.length; i++) {
            answer[(i + K) % A.length] = A[i];
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for(int i = 0; i < n; i++) array[i] = sc.nextInt();
        int k = sc.nextInt();
        Rotate r = new Rotate();
        int[] solution = r.solution(array, k);
        for(int i = 0; i < n; i++) System.out.print(solution[i] + ", ");
        System.out.println();
    }
}

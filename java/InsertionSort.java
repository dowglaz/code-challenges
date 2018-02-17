import java.util.*;

public class InsertionSort {
    private static void insertionSort(int[] array) {
        int rightMost = array[array.length - 1];
        for(int i = array.length - 1; i >= 0; i--) {
            if(i == 0 || rightMost > array[i - 1]) {
                array[i] = rightMost;
                printArray(array);
                return;
            }
            array[i] = array[i - 1];
            printArray(array);
        }
    }

    private static void printArray(int[] array) {
        for(int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] array = new int[size];
        for(int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }
        insertionSort(array);
    }
}


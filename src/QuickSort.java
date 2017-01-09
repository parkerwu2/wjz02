import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;

public class QuickSort {
    static void quicksort(int n[], int left, int right) {
        int dp;
        if (left < right) {
            dp = partition(n, left, right);
            quicksort(n, left, dp - 1);
            quicksort(n, dp + 1, right);
        }
    }

    static int partition(int n[], int left, int right) {
        int pivot = n[left];
        while (left < right) {
            while (left < right && n[right] >= pivot)
                right--;
            if (left < right)
                n[left++] = n[right];
            while (left < right && n[left] <= pivot)
                left++;
            if (left < right)
                n[right--] = n[left];
        }
        n[left] = pivot;
        for (Integer x : n) {
            System.out.print(x + " ");
        }
        System.out.println();
        return left;
    }

    public static void main(String[] args) {
        Random rand = new Random();
        int[] a = new int[10];
        for (int i = 0; i < 10; i++) {
            a[i] = rand.nextInt(100);
        }
        for (Integer x : a) {
            System.out.print(x + " ");
        }
        System.out.println();
        quicksort(a, 0, a.length - 1);
        for (Integer x : a) {
            System.out.print(x + " ");
        }
        ConcurrentHashMap map = new ConcurrentHashMap();
    }
}

package sorting;

import java.util.Arrays;

public class InsertionSortApp {
    public static void main(String[] args) {
        int arr[] = {1, 9, 2, 8, 3, 7, 4, 6, 5, 0};

        insertionSort(arr);
    }

    private static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;


            while (j >= 0 && arr[j] < key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
        System.out.println(Arrays.toString(arr));
    }
}

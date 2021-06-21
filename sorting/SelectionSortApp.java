package sorting;

import java.util.Arrays;

public class SelectionSortApp {
    public static void main(String[] args) {
        int arr[] = {1, 9, 2, 8, 3, 7, 4, 6, 5, 0};

        selectionSort(arr);
    }
    private static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length-1; i++)
        {
            int min = i;
            for (int j = i+1; j < arr.length; j++)
                if (arr[j] > arr[min])
                    min = j;


            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }
}

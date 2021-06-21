package sorting;

import java.util.Arrays;

public class BubbleSortApp {
    public static void main(String[] args) {
        int arr[] = {1, 9, 2, 8, 3, 7, 4, 6, 5, 0};

        bubbleSort(arr);

    }

    private static void bubbleSort(int[] arr) {
        for(int i = 0; i < arr.length; i++){
            boolean flag = false;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }
}

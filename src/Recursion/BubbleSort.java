package Recursion;

import java.lang.reflect.Array;
import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {3,4,1,2};
        sort(arr.length - 1, 0, arr);
        System.out.println(Arrays.toString(arr));
    }

    static void sort(int row, int col, int[] arr) {
        if (row == 0) return;

        if (col < row) {
            if (arr[col] > arr[col + 1]) {
                // swap
                int temp = arr[col];
                arr[col] = arr[col + 1];
                arr[col + 1] = temp;
            }
            sort(row, col + 1, arr);
        } else {
            sort(row - 1, 0, arr);
        }
    }
}

package Sort;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bubbleSort(int[] arr){
        boolean swapped;
        //run the steps n-1 times
        for (int i = 0; i < arr.length ; i++) {
            swapped=false;
            //for each step, the max item will come at the last respective index
            for (int j = 1; j < arr.length-i ; j++) {
                if(arr[j]<arr[j-1]){
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] =temp;
                    swapped = true;
                }
            }
        // if you are not swapped for a particular value of i, it means an array is sorted

            if(!swapped) break;
        }
    }
}

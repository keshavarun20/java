package Recursion;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr ={4,3,2,8,1};
//        sort(arr, arr.length);
//        System.out.println(Arrays.toString(arr));
        singleSort(arr.length,0,0,arr);
        System.out.println(Arrays.toString(arr));
    }

    static int maxInt(int[] arr,int max, int i, int end){
        if(i == end) return max;
        if (arr[max]<arr[i]) {
            max =i;
        }
        return maxInt(arr,max,i+1,end);
    }

    static void sort(int[] arr, int end){
        if(end == 0) return;
        int max= maxInt(arr,0,0,end);
        int temp= arr[max];
        arr[max]=arr[end-1];
        arr[end-1]=temp;
        sort(arr,end-1);

    }

    static void singleSort(int row,int col, int max, int[] arr){
        if(row == 0) return;
        if (col<row){
            if (arr[col]>arr[max]){
                singleSort(row,col+1,col,arr);
            }else {
                singleSort(row,col+1,max,arr);
            }
        } else {
            int temp = arr[max];
            arr[max] = arr[row-1];
            arr[row-1] = temp;
            singleSort(row-1,0,0,arr);
        }
    }
}

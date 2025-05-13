package array;

import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) {
         int[] arr ={1,3,23,9,18};
         int s=0;
         int e= arr.length - 1;

        reverse(arr,s,e);
        System.out.println(Arrays.toString(arr));
    }

    static void reverse(int[] arr,int s, int e){

        while(s < e){
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] =temp;
            s++;
            e--;
        }

    }
}

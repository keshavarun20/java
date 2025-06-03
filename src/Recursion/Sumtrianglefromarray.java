package Recursion;

import java.util.Arrays;

public class Sumtrianglefromarray {

    public static void main(String[] args) {
        int[] arr= {1, 2, 3, 4, 5};

        triangleFunction(arr);
    }

    static void triangleFunction(int[] arr) {
        if (arr.length == 1) {
            System.out.println(Arrays.toString(arr));  // print the smallest array first
            return;
        }

        int[] newArr = new int[arr.length - 1];
        for (int i = 0; i < arr.length - 1; i++) {
            newArr[i] = arr[i] + arr[i + 1];
        }

        triangleFunction(newArr);   // recurse first

        System.out.println(Arrays.toString(arr));  // print AFTER recursion (on return)
    }

}

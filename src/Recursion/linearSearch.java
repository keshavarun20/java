package Recursion;

import java.util.ArrayList;

public class linearSearch {
    public static void main(String[] args) {
        int arr[] = {1,2,3,18,18};
       helper(arr,18,0);
    }

    static int search(int s, int target,int[] arr){
        if (s >= arr.length) return -1;
        if (arr[s] == target) return s;
        return search(s+1,target,arr);
    }
    static boolean searchh(int s, int target,int[] arr){
        if (s >= arr.length) return false;
        return arr[s] == target || searchh(s+1,target,arr); // short-circuit: if found, stop
    }

    static void helper(int[] arr, int target, int index) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> result = getAllIndex(arr, target, index, list);
        System.out.println(result);
        System.out.println(list);
    }

    static ArrayList<Integer> getAllIndex(int[] arr, int target, int index, ArrayList<Integer> list) {
        if (index == arr.length) {
            return list;
        }

        if (arr[index] == target) {
            list.add(index);
        }

        return getAllIndex(arr, target, index + 1, list);
    }

}

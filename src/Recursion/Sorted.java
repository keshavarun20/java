package Recursion;

public class Sorted {
    public static void main(String[] args) {
        int[] arr = {1,2,8,7,7};
        System.out.println(sorted(0,arr));
    }

    static boolean sorted(int s , int[] arr){
        if (s >= arr.length - 1) return true;
        return arr[s]<=arr[s+1] && sorted(s+1,arr);
    }
}

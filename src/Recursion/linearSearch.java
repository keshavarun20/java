package Recursion;

public class linearSearch {
    public static void main(String[] args) {
        int arr[] = {1,2,3,18,9};
        System.out.println(search(0,198,arr));
        System.out.println(searchh(0,198,arr));
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
}

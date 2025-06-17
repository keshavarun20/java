package Recursion;

public class RoatedSortedArray {
    public static void main(String[] args) {
        int[] arr = {5,6,7,8,9,1,2,3};
        System.out.println(find(arr,0, arr.length-1, 9));
    }

    static int find(int [] arr, int s, int e,int target){
        if (s>e) return -1;
        int mid = s +(e-s)/2;
        if (arr[mid] == target ) return mid;
        // case 1
        if (arr[s] <= arr[mid]){
            if (target>=arr[s] && target<=arr[mid]) {
                return find(arr,s,mid-1,target);
            }
            else {
                return find(arr,mid+1,e,target);
            }
        }

        //case 2
        if (target>=arr[mid] && target<=arr[e]) return find(arr,mid+1,e,target);
        else return find(arr,s,mid-1,target);
    }
}

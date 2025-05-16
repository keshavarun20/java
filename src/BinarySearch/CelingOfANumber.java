package BinarySearch;

public class CelingOfANumber {

    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18};

        System.out.println(ceiling(arr,15));
        System.out.println(floor(arr,15));
    }

    static int ceiling(int[] arr, int target){
        int s =0, e = arr.length -1;
        if (target > arr[e]) return -1;
        while(s<=e){
            int mid = s + (e - s) / 2;
            if (arr[mid] > target) e=mid - 1;
            else if (arr[mid]<target) s=mid + 1;
            else return arr[mid];

        }

        return arr[s];
    }

    static int floor(int[] arr, int target){
        int s =0, e = arr.length -1;
        if (target < arr[s]) return -1;
        while(s<=e){
            int mid = s + (e - s) / 2;
            if (arr[mid] > target) e=mid - 1;
            else if (arr[mid]<target) s=mid + 1;
            else return arr[mid];

        }

        return arr[e];
    }
}

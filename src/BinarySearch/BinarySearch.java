package BinarySearch;

public class BinarySearch {

    public static void main(String[] args) {
        int[] arr = {-23,-3,1,2,6,89,344,554};

        System.out.println(binarySearch(arr,89));
    }

    static int binarySearch(int[] arr, int target){
        int s =0, e = arr.length -1;

        while(s<=e){
            int mid = s + (e - s) / 2;
           if (arr[mid] > target) e=mid - 1;
            else if (arr[mid]<target) s=mid + 1;
                else return mid;

        }

        return -1;

    }
}

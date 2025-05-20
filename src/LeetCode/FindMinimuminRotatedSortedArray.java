package LeetCode;

public class FindMinimuminRotatedSortedArray {
    public static void main(String[] args) {

        int[] arr ={11,13,15,17};
        int s=0;
        int e = arr.length-1;

        int pivot =findPivot(arr,s,e);
        if (pivot == -1) System.out.println(arr[0]);
        else System.out.println(arr[pivot+1]);
    }

    static int findPivot(int[] arr,int s,int e){
            while (s <= e) {
                int mid=s+(e-s)/2;
                //if we find the pivot, then we can easily find the minimum that will lie next to the pinot
                if(mid<e && arr[mid] >arr[mid+1]) return mid;
                if (s<mid && arr[mid-1] > arr[mid]) return mid-1;
                if (arr[mid] <= arr[s]) {
                    e = mid - 1;
                } else {
                    s = mid + 1;
                }
        }
        return -1;
    }
}

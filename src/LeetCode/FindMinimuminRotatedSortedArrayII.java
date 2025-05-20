package LeetCode;

public class FindMinimuminRotatedSortedArrayII {
    public static void main(String[] args) {

        int[] arr ={1,3,5};
        int s=0;
        int e = arr.length-1;

        int pivot = findPivotWithDuplicate(arr,s,e);
        if (pivot == -1) System.out.println(arr[0]);
        else System.out.println(arr[pivot+1]);
    }

    static int findPivotWithDuplicate(int[] arr, int s, int e){
        while (s <= e) {
            int mid=s+(e-s)/2;
            //if we find the pivot, then we can easily find the minimum that will lie next to the pinot
            if(mid<e && arr[mid] >arr[mid+1]) return mid;
            if (s<mid && arr[mid-1] > arr[mid]) return mid-1;
            if(arr[mid] == arr[s] && arr[mid] == arr[e]){

                if(s < e && arr[s] > arr[s + 1]){
                    return s;
                }
                s++;
                if(e > s && arr[e - 1] > arr[e]) {
                    return e-1;
                }
                e--;
            } else if(arr[s] < arr[mid] || (arr[s] == arr[mid] && arr[mid] > arr[e])) {
                s=mid+1;
            } else e =mid-1;
        }
        return -1;
    }
}

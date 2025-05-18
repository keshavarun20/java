package BinarySearch;

public class FindTheRotationCount {
    public static void main(String[] args) {
        int[] arr ={18,1,3,5,6};
        System.out.println(count(arr));

    }

    static int count(int[] arr){
        int s =0, e = arr.length -1;


        while(s<=e){
            int mid = s+(e-s)/2;
            if(mid<e && arr[mid]>arr[mid+1]) return mid+1;
            if(mid>s && arr[mid-1]>arr[mid]) return mid;

            if (arr[mid] <= arr[s])  e=mid-1;
            else s=mid+1;
        }

        return 0;
    }
}

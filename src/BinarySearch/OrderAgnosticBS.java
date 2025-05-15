package BinarySearch;

public class OrderAgnosticBS {

    public static void main(String[] args) {
        int[] arr ={56,45,34,23,2,1};

        System.out.println(orderAgnosticBs(arr,45));
    }

    static int orderAgnosticBs(int[] arr, int target){
        int s =0, e = arr.length -1;
        if(arr[s]<arr[e]) {
            while (s <= e) {
                int mid = s + (e - s) / 2;
                if (arr[mid] > target) e = mid - 1;
                else if (arr[mid] < target) s = mid + 1;
                else return mid;

            }
        } else {
            while (s <= e) {
                int mid = s + (e - s) / 2;
                if (arr[mid] > target) s = mid + 1;
                else if (arr[mid] < target) e = mid - 1;
                else return mid;

            }
        }

        return -1;

    }
}

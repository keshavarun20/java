package LeetCode;

public class SearchinRotatedSortedArray {

    public static void main(String[] args) {
        int[] nums = {1,0,1,1,1};

        System.out.println(binarySearch(nums,0));
    }

    static int binarySearch(int[] nums, int target){
        int s =0, e = nums.length -1;

        while(s<=e){
            int mid = s + (e - s) / 2;
            if (nums[s] == nums[mid] && nums[e] == nums[mid]){
                s++;
                e--;
            }
            if( nums[mid] == target) return mid;
            if (nums[mid] >= nums[s]) {
                if (nums[mid] > target && target >= nums[s]) e = mid - 1;
                else s = mid + 1;
            } else {
                if (nums[mid] < target && target <= nums[e]) s = mid + 1;
                else e = mid - 1;
            }

        }

        return -1;

    }
}

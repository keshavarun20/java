package LeetCode;

import java.util.Arrays;

public class TwoSumII {

    public static void main(String[] args) {
        int[] arr = {2,7,11,15};

        System.out.println(Arrays.toString(binarySearch(arr, 9)));
    }

    static int[] binarySearch(int[] numbers, int target){
        int s =0, e = numbers.length -1;

        while(s<=e){
            int sum = numbers[s] +numbers[e];
            if (sum > target) e=e- 1;
            else if (sum<target) s=s + 1;
            return new int[]{s + 1, e + 1};

        }

        return new int[]{-1, -1};

    }
}

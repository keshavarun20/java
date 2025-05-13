package LeetCode;

import java.util.Arrays;

public class ShuffletheArray {

    public static void main(String[] args) {
        int[] nums = {1,1,2,2};
        int n = 2;
        int[] ans = new int[2*n];

        for (int i =0; i<n; i++){
            ans[2 * i] = nums[i];
            ans[2 * i + 1] = nums[i + n];
        }
        System.out.println(Arrays.toString(ans));
    }
}

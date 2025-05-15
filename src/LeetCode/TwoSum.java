package LeetCode;

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {3,2,4};
        int[] ans=new int[2];
        int target = 6;
        for (int i = 0; i<nums.length;i++){
            for (int j =i+1;j<nums.length;j++){
                if (nums[i] + nums[j] == target){
                    ans[0] =i;
                    ans[1]=j;
                }
            }
        }

        System.out.println(Arrays.toString(ans));
    }
}

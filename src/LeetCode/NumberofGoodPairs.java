package LeetCode;

public class NumberofGoodPairs {
    public static void main(String[] args) {
        int[] nums = {1,1,1,1};
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }
        }



        System.out.println("Number of good pairs: " + count);
    }
}

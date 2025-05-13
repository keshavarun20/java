package LeetCode;

import java.util.Arrays;

public class RichestCustomerWealth {
    public static void main(String[] args) {
        int[][] nums = {{1, 2, 3}, {3, 2, 1}};
        int maxWealth = 0;

        for (int[] num : nums) {
            int sum = 0;
            for (int i : num) {
                sum += i;
            }
            maxWealth = Math.max(maxWealth, sum);
        }

        System.out.println(maxWealth);
    }
}

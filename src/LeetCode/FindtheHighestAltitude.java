package LeetCode;

import java.util.Arrays;

public class FindtheHighestAltitude {

    public static void main(String[] args) {
        int[] gain ={-4,-3,-2,-1,4,3,2};
        int sum =0;
        int max =0;

        for (int j : gain) {
            sum += j;
            if (sum > max) {
                max = sum;
            }
        }

        System.out.println(max);
    }


}

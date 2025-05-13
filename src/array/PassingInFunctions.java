package array;

import java.util.Arrays;

public class PassingInFunctions {
    public static void main(String[] args) {
        int[] nums = {3, 4, 5 ,6, 7};

        System.out.println(Arrays.toString(nums));
        changeArray(nums);
        System.out.println(Arrays.toString(nums));
    }

    static void changeArray(int[] arr){
        arr[0] = 99;
    }
}

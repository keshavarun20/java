package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PlusOne {
    public static void main(String[] args) {
        int[] digits ={9,9,9};
        //List<Integer> plusOne = new ArrayList<>();
        int l = digits.length - 1;
        while (l >= 0){
            if(digits[l]<9){
                digits[l]+=1;
                break;
            } else{
                digits[l] = 0;
                l--;
            }

            if (l < 0) {
                int[] newDigits = new int[digits.length + 1];
                newDigits[0] = 1; // the rest are zero by default
                digits = newDigits;
            }
        }
        System.out.println(Arrays.toString(digits));
    }
}

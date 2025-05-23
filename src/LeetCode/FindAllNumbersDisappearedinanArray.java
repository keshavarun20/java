package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class FindAllNumbersDisappearedinanArray {
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        List<Integer> ans=cyclicSort(arr);;
        System.out.println(ans);
    }

    static List<Integer> cyclicSort(int[] arr){
        int i=0;
        while( i<arr.length){
            int correct=arr[i]-1;
            if ( arr[i] != arr[correct] ){
                int temp = arr[i];
                arr[i] = arr[correct];
                arr[correct] = temp;
            } else i++;
        }
        List<Integer> ans = new ArrayList<>();
        for (i = 0; i < arr.length; i++) {
            if (arr[i] != i+1) {
                ans.add(i+1);
            }
        }

        return ans;
    }
}

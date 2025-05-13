package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;

public class CreateTargetArrayintheGivenOrder {
    public static void main(String[] args) {
        int[] nums ={0,1,2,3,4};
        int[] index = {0,1,2,2,1};
        ArrayList<Integer> target = new ArrayList<>();

        for (int i = 0; i < nums.length; i++){
            target.add(index[i],nums[i]);
        }

        for (int i = 0; i < target.size(); i++){
            System.out.println(target.get(i));
        }
    }
}

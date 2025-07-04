package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
    public static void main(String[] args) {
        int[] candidates = {2, 3, 6, 7};
        List<List<Integer>> result = new ArrayList<>();
        combaindSum(candidates, 8, new ArrayList<>(), 0, result);

        System.out.println(result);
    }

    static void combaindSum(int[] candidates,int target, List<Integer> p, int start, List<List<Integer>> result){
        if (target == 0){
            result.add(p);
            return;
        }
        for (int i = start; i < candidates.length; i++) {
            if (candidates[i] <= target) {
                List<Integer> newList = new ArrayList<>(p);
                newList.add(candidates[i]);
                combaindSum(candidates, target - candidates[i], newList, i,result);
            }
        }
    }
}

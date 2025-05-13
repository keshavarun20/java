package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class KidsWiththeGreatestNumberofCandies {

    public static void main(String[] args) {
        int[] candies ={2,3,5,1,3};
        int extraCandies = 3;

        System.out.println(result(candies, extraCandies));

//        for (int i =0; i<candies.length; i++){
//            int sum =0;
//            sum = candies[i] + extraCandies;
//
//            if(sum>=max){
//                System.out.print("true" +",");
//            }else{
//                System.out.print("false" + ",");
//            }
//        }
    }

    static List<Boolean> result(int[] candies, int extraCandies){

        int max = candies[0];

        for (int candy : candies) {
            if (candy> max) {
                max = candy;
            }
        }

        List<Boolean> result = new ArrayList<>();

        for (int candy : candies) {
            result.add(candy + extraCandies >= max);
        }

        return result;

    }
}

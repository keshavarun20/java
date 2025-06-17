package Recursion;

import java.util.ArrayList;

public class ArrayListWithoutPara {
    public static void main(String[] args) {
        int[] arr = {1,4,6,7,5,4};
        System.out.println(find(arr,4,0));
    }

    static ArrayList<Integer> find(int[] arr, int target, int index){
         ArrayList<Integer> list = new ArrayList<>();
         if (index == arr.length){
             return list;
         }
         if (arr[index]  == target) list.add(index);
        ArrayList<Integer> ansFromBelow= find(arr,target,index+1);
        list.addAll(ansFromBelow);
        return list;
    }
}

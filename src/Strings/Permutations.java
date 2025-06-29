package Strings;

import java.util.ArrayList;

public class Permutations {
    public static void main(String[] args) {
        String up = "abc";
//        permutate("",up);
        System.out.println(permutateArrayList("",up));
        System.out.println(permutateCount("",up));
        System.out.println(permutateCount2("","abcd",0));
    }

    static void permutate(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);
        String rest = up.substring(1);
        for (int i = 0; i <p.length()+1 ; i++) {
            String f =p.substring(0,i);
            String s = p.substring(i);
            permutate(f+ch+s,rest);

        }
    }

    static ArrayList<String> permutateArrayList(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> ans=new ArrayList<>();

        char ch = up.charAt(0);

        String rest = up.substring(1);

        for (int i = 0; i <p.length()+1 ; i++) {
            String f =p.substring(0,i);
            String s = p.substring(i);
            ans.addAll(permutateArrayList(f+ch+s,rest));
        }

        return ans;
    }

    static int permutateCount(String p, String up){
        if(up.isEmpty()){
            return 1;
        }

        int count = 0;
        char ch = up.charAt(0);
        String rest = up.substring(1);
        for (int i = 0; i <p.length()+1 ; i++) {
            String f =p.substring(0,i);
            String s = p.substring(i);
            count =count + permutateCount(f+ch+s,rest);

        }


        return count;
    }

    static int permutateCount2(String p, String up,int count){
        if(up.isEmpty()){
            return count+1;
        }

        char ch = up.charAt(0);
        String rest = up.substring(1);
        for (int i = 0; i <p.length()+1 ; i++) {
            String f =p.substring(0,i);
            String s = p.substring(i);
            count = permutateCount2(f+ch+s,rest,count); //You must assign the returned value of the recursive call back to count to accumulate it properly.

        }


        return count;
    }

}

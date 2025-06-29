package Strings;

import java.util.ArrayList;

public class Permutations {
    public static void main(String[] args) {
        String up = "abc";
//        permutate("",up);
        System.out.println(permutateArrayList("",up));
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

}

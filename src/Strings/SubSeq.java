package Strings;

import java.util.ArrayList;

public class SubSeq {
    public static void main(String[] args) {
        subSeqToASCII("","abc");
        //System.out.println(subSeqAA("","abc"));
    }

    static void subSeq(String p, String up){
        if (up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        subSeq(p + ch,up.substring(1));
        subSeq(p,up.substring(1));
    }

    static ArrayList<String> subSeqA(String p, String up){
        if (up.isEmpty()){
            ArrayList<String> list =new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> left = subSeqA(p + ch,up.substring(1));
        ArrayList<String> right= subSeqA(p,up.substring(1));

        left.addAll(right);
        return left;
    }

    static void subSeqToASCII(String p, String up){
        if (up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        subSeqToASCII(p + ch,up.substring(1));
        subSeqToASCII(p,up.substring(1));
        subSeqToASCII(p + (ch+0),up.substring(1));
    }

}

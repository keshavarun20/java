package LeetCode;

import java.util.ArrayList;
import java.util.List;

class Solution {
//    public List<String> letterCombinations(String digits) {
//
//    }
    public static void main(String[] args) {
        System.out.println(subSeq("","7"));
        char ch =(char)('a' +18);
        System.out.println(ch);
    }

    public static List<String> subSeq(String p,String up){
        if (up.isEmpty()){
            List<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        int digit =up.charAt(0) - '0';
        int start = (digit-2)*3;
        if (digit > 7) start++;
        List<String> ans = new ArrayList<>();
        if (digit == 1 || up.charAt(0) == ' '){
            return ans;
        }
        int lettersCount=3;
        if (digit == 7 || digit == 9) lettersCount = 4;

        for (int i =start ; i <start+lettersCount ; i++) {
            char ch =(char)('a' +i);
            ans.addAll(subSeq(p+ch,up.substring(1)));
        }
        return ans;
    }
}

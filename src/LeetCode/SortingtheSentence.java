package LeetCode;

import java.util.Arrays;

public class SortingtheSentence {

    public static void main(String[] args) {
        String s="is2 sentence4 This1 a3";
        String[] split= s.split(" ");
        String[] result= new String[split.length];
        for (String string : split) {
            char lastChar= string.charAt(string.length()-1);
            int position = lastChar - '0';

            String word = string.substring(0,string.length()-1);

            result[position-1] = word;
        }

        System.out.println(Arrays.toString(result));

    }
}

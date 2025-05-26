package LeetCode;

public class ShuffleString {

    public static void main(String[] args) {
        String s= "codeleet";
        int[] indices ={4,5,6,7,0,2,1,3};
        StringBuilder builder = new StringBuilder(s);
        for (int i = 0; i < indices.length ; i++) {
            builder.setCharAt(indices[i],s.charAt(i));
        }
        System.out.println(builder);
    }
}

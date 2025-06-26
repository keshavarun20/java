package Recursion;

public class RemoveString {
    public static void main(String[] args) {
        String str = "banana";
        StringBuilder ans =new StringBuilder();
        //System.out.println(remove(str,0,ans));
        skip(str,"");
    }
    static String remove(String str, int i, StringBuilder ans){
        if(i>=str.length()) return ans.toString();

        if(str.charAt(i) != 'a'){
            ans.append(str.charAt(i));
        }
            return remove(str,i+1,ans);
    }

    static void skip(String str,String ans){
        if (str.isEmpty()){
            System.out.println(ans);
            return;
        }
        char ch =str.charAt(0);
        if (ch == 'n'){
            skip(str.substring(1),ans);
        }
        else skip(str.substring(1),ans+ch);
    }
}

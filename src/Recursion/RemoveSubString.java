package Recursion;

public class RemoveSubString {
    public static void main(String[] args) {
    String str = "abcapplexyapplez";
    skip(str,"");
    skipAPP(str,"");
    }

    static void skip(String str,String ans){
        if(str.isEmpty()){
            System.out.println(ans);
            return;
        }
        if (str.startsWith("apple")){
            skip(str.substring(5),ans);
        }
        else {
            skip(str.substring(1),ans+str.charAt(0));
        }
    }

    static void skipAPP(String str,String ans){
        if(str.isEmpty()){
            System.out.println(ans);
            return;
        }
        if (str.startsWith("app")&&!str.startsWith("apple")){
            skipAPP(str.substring(3),ans);
        }
        else {
            skipAPP(str.substring(1),ans+str.charAt(0));
        }
    }
}

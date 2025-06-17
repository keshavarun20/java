package Recursion;

public class No0s {
    public static void main(String[] args) {
        System.out.println(count(2020780090,0));
    }

    static int count(int n,int count){
        if (n/10 == 0)return count;
        if (n%10 == 0) count++;
        return count(n/10,count);
    }
}

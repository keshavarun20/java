package Recursion;

public class FindNo {

    public static void main(String[] args) {

    }

    static int num(int n,int a){
        if (n <= 0 || a <= 1) return -1;
        int x = 0;
        if (n == 1) return x;
        if (n % a != 0) return -1;
        x+=1;
        return num(n/a,a);
    }
}

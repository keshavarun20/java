package Recursion;

public class PrintNToN1 {
    public static void main(String[] args) {
        function(5);
    }

    static void function(int n){
        if (n==0)
        {
            return;
        }
        System.out.print(n + " ");
       function(n-1);
        System.out.print(n + " ");
    }
}

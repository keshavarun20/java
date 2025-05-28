package Recursion;

public class Numbers {
    public static void main(String[] args) {
        //write a function that takes in a number and prints it
        //print first 5 numbers
        print(1);
    }
    static void print(int n){
            if (n > 5) return;  // base case: stop recursion after 5
            System.out.println(n);
            print(n + 1);       // recursive call with next number
    }
}

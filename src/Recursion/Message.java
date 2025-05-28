package Recursion;

public class Message {
    public static void main(String[] args) {

        //Q: Write a function that prints hello world 5 times
        //so only need to call the method 1 time, and hello world should print 5 times how?
        greet();
    }

    static void greet() {
        System.out.println("Hello World");
        greet1();
    }
    static void greet1() {
        System.out.println("Hello World");
        greet2();
    }
    static void greet2() {
        System.out.println("Hello World");
        greet3();
    }
    static void greet3() {
        System.out.println("Hello World");
        greet4();
    }
    static void greet4() {
        System.out.println("Hello World");
    }


}

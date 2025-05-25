package Strings;

public class Strings {
    public static void main(String[] args) {
        String a = "Keshav";
        String b = "Keshav";
        String c = new String("Keshav");

        System.out.println(a == b);       // true (both refer to same object in String Pool)
        System.out.println(a == c);       // false (different objects in memory)
        System.out.println(a.equals(c));  // true (same value: "Keshav")


    }
}

package array;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.addFirst(2);
        list.add(0,4);
        System.out.println(list);
        Collections.reverse(list);
        System.out.println(list);
    }
}

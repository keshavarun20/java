import java.util.Arrays;

public class VarArgs {

    public static void main(String[] args) {

        pun(1,2);
        pun(2,3,4,5,6,7);
    }

    static void pun(int ...v){
        System.out.println(Arrays.toString(v));
    }

    static void pun(int q,int a){
        System.out.println(a + " " + q);
    }
}

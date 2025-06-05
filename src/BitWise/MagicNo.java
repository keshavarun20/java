package BitWise;

public class MagicNo {
    public static void main(String[] args) {
        System.out.println(magicNo(6));
    }

    static int magicNo(int n){
        int ans =0;
        int power = 1;
        while(n!=0){
            int last = (n&1);
            ans += (int) (last * Math.pow(5,power));
            power++;
            n=n>>1;
        }
        return ans;
    }
}

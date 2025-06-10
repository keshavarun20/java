package Math;

public class FindingSquareRoot {
    public static void main(String[] args) {
        System.out.println(squareRootPrecise(41,3));
    }

    //perfect square root
    static int squareRoot(int n){
        int s = 0;
        int e = n;

        while (s<=e){
            int mid = s + (e - s) / 2;
            if (mid * mid == n) return mid;
            if (mid*mid>n)e=mid-1;
            else s =mid+1;
        }

        return -1;
    }

    static double squareRootPrecise(int n, int p){
        int s = 0;
        int e = n;
        double root =0.0;

        while (s<=e){
            int mid = s + (e - s) / 2;
            if (mid * mid == n){
                return mid;
            };
            if (mid*mid>n)e=mid-1;
            else s =mid+1;
        }
        root = e;
        double increment=0.1;
        for (int i = 0; i <p ; i++) {
            while (root *root <=n){
                root+=increment;
            }
            root-=increment;
            increment/=10;
        }
        return root;
    }
}

package Math;

public class Sieve {
    public static void main(String[] args) {
        sieveOfEratosthenes(40);
    }
    public static void sieveOfEratosthenes(int n){
        boolean[] isPrime = new boolean[n + 1];

        for (int i = 2; i*i <=n ; i++) {
            if (!isPrime[i]){
                for (int j = i*2; j <=n ; j+=i) {
                    isPrime[j] = true;
                }
            }
        }
        for (int i = 2; i <=n ; i++) {
            if (!isPrime[i]){
                System.out.print(i + " ");
            }
        }
    }
}

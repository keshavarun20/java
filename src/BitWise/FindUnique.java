package BitWise;

public class FindUnique {
    public static int findSingle(int[] arr) {
        int result = 0;
        for (int num : arr) {
            result ^= num;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 1, 2, 1, 3, 6, 4};
        System.out.println("Unique number: " + findSingle(arr));
    }
}

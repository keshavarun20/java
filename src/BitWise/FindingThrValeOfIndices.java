package BitWise;

public class FindingThrValeOfIndices {
    public static void main(String[] args) {
        int index = 7;
        int base = 3;
        int ans =1;
        while( index!=0){
            if ((index & 1) !=0){
                ans  *= base;
            }
            base *=  base;
            index =index >> 1;
        }

        System.out.println(ans);
    }
}

package LinearSearch;

public class LinearSearch {
    public static void main(String[] args) {

        int[] arr ={23,45,6,5,34,89};

        System.out.println(linearSearch(arr,500));

    }

    static int linearSearch(int[] arr, int target){
        if(arr.length == 0) return -1;

        for (int index =0;index< arr.length ;index++){
            if(arr[index] == target) {
                return index;
            }
        }

        return -1;
    }
}

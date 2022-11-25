import java.util.Arrays;

public class selectionsort {
    public static void main(String[] args) {
        int[] arr = {5, 3, 4, 1, 2};
        slcsort(arr);
        System.out.println(Arrays.toString(arr));

    }
    public static void slcsort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            // find the max item in the remaining array and swap with correct index
            int last = arr.length - i - 1;
            int maxIndex = getMaxIndex(arr, 0, last);
            swap(arr, maxIndex, last);
        }
    }
    public static int getMaxIndex(int[] arr, int s, int e){
        int max = s;
        for (int i = 0; i <= e; i++){
            if(arr[max] < arr[i]){
                max = i;
            }
        }
        return  max;
    }
    public static void swap(int[] arr, int fst, int snd){
        int temp = arr[fst];
        arr[fst] = arr[snd];
        arr[snd] = temp;
    }
}

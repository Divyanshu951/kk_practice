import java.lang.reflect.Array;
import java.util.Arrays;

public class reverse {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }

        System.out.println(Arrays.toString(arr));

    }
    public static void swap(int[] arr, int s, int e){
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;


    }
}
import java.lang.reflect.Array;
import java.util.Arrays;

public class minnum {
    public static void main(String[] args) {
        int[] arr = {3, 3, 2, 5, 7, -743,-2,0};
        int y = minn(arr);
        System.out.println(y);
//        Arrays.sort(arr);
//        System.out.println("min = " +arr[0]);
//        System.out.println("max = " +arr[arr.length - 1]);

    }
    public static int minn(int[] arr){
        int ans = arr[0];
        for(int i = 0; i < arr.length; i++ ) {
            if (arr[i] < ans) {
                ans = arr[i];
            }
        }return ans;
    }

}

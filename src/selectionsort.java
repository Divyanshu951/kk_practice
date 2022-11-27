import java.util.Arrays;

public class selectionsort {
    public static void main(String[] args) {
        int[] arr = {5, 3, 4, 1, 2};
        cycsort(arr);
        System.out.println(Arrays.toString(arr));

    }
    public static void cycsort(int[] arr){
        int i = 0;
        while(i < arr.length){
            int correct = arr[i] - 1;
            if(arr[i] != arr[correct]){
                swap(arr,i,correct);
            }else{
                i++;
            }
        }
    }
    public static void insesort(int[] arr){
        for(int i = 0; i < arr.length - 1; i++){
            for(int j = i + 1; j > 0; j--){
                if(arr[j] < arr[j - 1]){
                    swap(arr,j,j-1);
                }else{
                    break;
                }
            }

        }
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
//    GFG code
//    void sort(int arr[])
//    {
//        int n = arr.length;
//
//        // One by one move boundary of unsorted subarray
//        for (int i = 0; i < n-1; i++)
//        {
//            // Find the minimum element in unsorted array
//            int min_idx = i;
//            for (int j = i+1; j < n; j++)
//                if (arr[j] < arr[min_idx])
//                    min_idx = j;
//
//            // Swap the found minimum element with the first
//            // element
//            int temp = arr[min_idx];
//            arr[min_idx] = arr[i];
//            arr[i] = temp;
//        }
//    }


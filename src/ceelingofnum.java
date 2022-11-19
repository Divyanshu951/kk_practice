public class ceelingofnum {
    public static void main(String[] args) {


    }
    public static int bnry9(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        while(start <= end ){
            // find the middle element
            int mid = start + (end - start)/2;
            if(arr[mid] == target){
                // ans found
                return mid;
            }
            if(target < arr[mid]){
                end = mid -1;
            }else if(target > arr[mid]){
                start = mid + 1;
            }

        }
        return -1;
    }
}

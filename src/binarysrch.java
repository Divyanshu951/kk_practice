public class binarysrch {
    public static void main(String[] args) {
        int[] arr = {2,11,13,14};
        int x = 3;
        int y = bnry9(arr,x);
        System.out.println(y);

    }
    public static int bnry9(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        while(start <= end ){
            // find the middle element
            int mid = start + (end - start)/2;
            if(target < arr[mid]){
                end = mid -1;
            }else if(target > arr[mid]){
                start = mid + 1;
            }
            else{
                // ans found
                return mid;
            }
        }
        return start;
    }

}

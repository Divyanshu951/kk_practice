public class binarysrch {
    public static void main(String[] args) {
        int[] arr = {2,11,13,14};
        int x = 13;
        int y = bnry9(arr,x);
        System.out.println(y);
        System.out.println(recbin(arr,13,0, arr.length-1));

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
    // using recursion
    public static int recbin(int[] arr,int target,int s,int e){
        if(s > e) return -1;
        int m = s + (e-s)/2;
        if(arr[m] == target) return m;
        if(target < arr[m]){
            // return so that the function can return the value to the parent function
            return recbin(arr,target,s,m-1);
        }
        return recbin(arr,target,m+1,e);

    }

}

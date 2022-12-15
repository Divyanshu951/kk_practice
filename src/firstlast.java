import java.util.Arrays;

public class firstlast {
    public static void main(String[] args) {
        int[] nums =  {10, 20, 15, 2, 23, 90, 67};
        int tar = 8;
        int answer = peakelmt(nums,tar);
        System.out.println(answer);
    }
    public static int peakelmt(int[] arr,int x){
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
            }

        }

        return max;
    }
//    public static int[] searchRange2(int[] nums, int target){
//        int[] ans = new int[2];
//        ans[0] = -1;
//        ans[1] = -1;
//        for (int i = 0; i < nums.length; i++) {
//            if(target != nums[i]){
//                continue;
//            }
//            if(ans[0] == -1){
//                ans[0] = i;
//            }
//            ans[1] = i;
//
//        }
//
//        return ans;
//    }
//    public static int[] searchRange(int[] nums, int target) {
//        int[] range = {-1, -1};
//
//        if (nums.length < 1) {
//            return range;
//        }
//
//        return findRange(nums, target, 0, nums.length, range);
//    }
//
//    private static int[] findRange(int[] array, int target, int startFrom, int endTo, int[] range) {
//        int half = (startFrom + endTo) / 2;
//
//        if (array[half] == target) {
//            if (range[0] == -1 && range[1] == -1) {
//                // initialize range with first found index
//                range[0] = half;
//                range[1] = half;
//            }
//
//            // the left border of the range can only be extended to the left
//            range[0] = range[0] > half ? half : range[0];
//            // the right border of the range can only be extended to the right
//            range[1] = range[1] > half ? range[1] : half;
//
//            if (endTo - startFrom < 2) return range;
//
//            // search target left
//            range = findRange(array, target, half, endTo, range);
//
//            // search target right
//            range = findRange(array, target, startFrom, half, range);
//
//        }
//        else if (array[half] < target && endTo - startFrom > 1) {
//
//            return findRange(array, target, half, endTo, range);
//
//        }
//        else if (array[half] > target && endTo - startFrom > 1) {
//
//            return findRange(array, target, startFrom, half, range);
//
//        }
//        return range;
//    }
}

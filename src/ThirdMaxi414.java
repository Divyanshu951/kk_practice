import java.util.Arrays;

public class ThirdMaxi414 {
    public static void main(String[] args) {
        int[] nums = {3,2,1};
//        thrdmax(nums);
//        System.out.println(Arrays.toString(nums));
        int res = thrdmax(nums);
        System.out.println(res);
    }
    public static int thrdmax(int[] nums){
//        // run the steps n-1 times
//        for(int i = 0; i < nums.length-1; i++){
//            // for each step the highest element will be in the last respective event
//            for(int j = 0; j < nums.length-i-1; j++){
//                // swap if the item is smaller than the previous item
//                if(nums[j+1] < nums[j]){
//                    // swap
//                    int temp = nums[j];
//                    nums[j] = nums[j+1];
//                    nums[j+1] = temp;
//                }
//            }
//        }
        int maxel1=0;
        int maxel2=0;
        int maxel3=0;

        int max1 = 0;
        int max2 = 0;
        int max3 = 0;

        for (int i=0; i<nums.length; i++){
            if(maxel1<nums[i])
            {maxel1=nums[i];
                max1=i;
            }
        }
        nums[max1]=0; //to exclude this one in nextsearch

        for (int j=0; j<nums.length; j++){
            if(nums[j]>maxel2)
            {maxel2=nums[j];
                max2=j;
            }
        }
        nums[max2]=0;

        for (int k=0; k<nums.length; k++){
            if(nums[k]>maxel3)
            {maxel3=nums[k];
                max3=k;
            }
        }
        return max3;
    }
}

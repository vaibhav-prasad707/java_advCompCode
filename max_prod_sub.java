import java.util.*;
public class max_prod_sub {
    public static int maxSumArray(int[] nums){
        int maxSum = nums[0];
        int currentSum = nums[0];
        for(int i = 1;i<nums.length;i++){
            currentSum = Math.max(nums[i],currentSum*nums[i]);
            maxSum = Math.max(maxSum,currentSum);
        }
        return maxSum;
    }
    public static void main(String[] args){
        int[] arr = {2,-2,3,4};
        int maxSum = maxSumArray(arr);
        System.out.println("Maximum subarray sum: "+maxSum);
    }
}

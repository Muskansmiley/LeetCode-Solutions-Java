// Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]). Return the running sum of nums.
// Example 1: Input: nums = [1,2,3,4]
//            Output: [1,3,6,10]
//            Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].
import java.util.*;
public class LC_1480_RunningSum {
    public static int[]runningsum(int[]nums){
        int currSum=0;
        for(int i=0;i<nums.length;i++){
            currSum=currSum+nums[i];
            nums[i]=currSum;
        }
        return nums;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n: ");
        int n=sc.nextInt();
        int nums[]=new int[n];
        for(int i=0;i<nums.length;i++){
            System.out.println("Enter nums at index:"+i);
            nums[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(runningsum(nums)));

        sc.close();
    }
}

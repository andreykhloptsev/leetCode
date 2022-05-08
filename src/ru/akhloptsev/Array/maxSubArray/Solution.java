package ru.akhloptsev.Array.maxSubArray;

public class Solution {

    public static void main(String[] args) {
        int[]arr = new int[]{-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(arr));
    }

    public static int maxSubArray(int[] nums) {
        int maxSum = nums[0], currSum = 0, curEnd = 0;
        while (curEnd< nums.length){
            currSum = currSum +nums[curEnd];
            if (currSum > maxSum){
                maxSum = currSum;
            }
            if (currSum<0){
                currSum = 0;
                curEnd = curEnd+1;
            } else {
                curEnd++;
            }
        }
        return maxSum;
    }
}

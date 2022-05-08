package ru.akhloptsev.rotateArray;

import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
         int[] nums = {1,2,3,4,5,6,7};
         var k = 3;
         rotate(nums, k);
    }

    public static void rotate(int[] nums, int k) {
          k = Math.floorMod(k, nums.length);
          reverse(nums, 0, nums.length - 1);
          reverse(nums, 0, k-1);
          reverse(nums, k, nums.length - 1);
          System.out.println(Arrays.toString(nums));
    }

    private static void reverse(int[] nums, int left, int right) {
        int temp;
        while (right > left){
            temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }
}

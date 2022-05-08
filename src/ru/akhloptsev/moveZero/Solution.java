package ru.akhloptsev.moveZero;

import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        int[] nums = new int[]{2, 8, 2, 0, 2, 4, 0, 3, 12};
        moveZeroes2(nums);
    }

    public static void moveZeroes(int[] nums) {
        var left = 0;
        var right = 0;
        int temp;
        while (right < nums.length) {
            if (nums[left] == 0) {
                while (right < nums.length ) {
                    if (nums[right] != 0) {
                        temp = nums[left];
                        nums[left] = nums[right];
                        nums[right] = temp;
                        break;
                    }
                    right++;
                }
                if (right == nums.length - 1) {
                    break;
                }
            }
            left++;
            right++;
        }
        System.out.println(Arrays.toString(nums));
    }

    public static void moveZeroes2(int[] nums) {
        int temp;
        for (int i = 0, lastNonZeroFoundAt = 0; i < nums.length ; i++) {
            if (nums[i] != 0){
                temp = nums[lastNonZeroFoundAt++];
                nums[lastNonZeroFoundAt] = nums[i];
                nums[i] = temp;
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}
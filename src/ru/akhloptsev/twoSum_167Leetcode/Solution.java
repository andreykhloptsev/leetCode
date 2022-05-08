package ru.akhloptsev.twoSum_167Leetcode;

import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        int[] nums = new int[]{2,7,11,15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }

    public static int[] twoSum(int[] numbers, int target) {
        int searchedRight;
        for (int left = 0; left < numbers.length -1 ; left++) {
            searchedRight = target - numbers[left];
            for (int right = left+1; right < numbers.length ; right++) {
                if (searchedRight < numbers[right]){
                    break;
                }
                if (searchedRight == numbers[right]){
                    return new int[]{left+1,right+1};
                }
            }
        }
        return new int[2];
    }

    public static int[] twoSum2(int[] numbers, int target) {
        int l =0, r = numbers.length-1;
        while (numbers[l]+numbers[r]!= target){
            if (numbers[l]+numbers[r]> target){
                l++;
            } else r--;
        }
        return new int[]{l + 1, r + 1};
    }
}

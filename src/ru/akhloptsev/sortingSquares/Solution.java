package ru.akhloptsev.sortingSquares;

import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        var nums = new int[]{-4, -1, 0, 3, 10};
        System.out.println(Arrays.toString(sortedSquares(nums)));
    }

    public static int[] sortedSquares(int[] nums) {
        int[] result = new int[nums.length];
        var left = 0;
        var right = nums.length-1;
        var i = nums.length-1;
        int rightElement;
        int leftElement;
        while (i>=0){
            rightElement = nums[right];
            leftElement = nums[left];
            if (Math.abs(rightElement) >= Math.abs(leftElement)){
                result[i] = rightElement*rightElement;
                right--;
            } else {
                result[i] = leftElement*leftElement;
                left++;
            }
            i--;
        }
        return result;
    }
}

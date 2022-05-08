package ru.akhloptsev.insertPlace;

public class Solution {

    public static void main(String[] args) {
        int[] nums = {1,3,5,6};
        int target = 0;
        System.out.println(searchInsert(nums, target));
    }

    public static int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length;
        int middle;
        int element;
        while (right > left ){
            middle = left + (right - left)/2;
            element = nums[middle];
            if (element == target){
                return middle;
            } else if (element > target){
                right = middle;
            } else {
                left = middle + 1;
            }
        }
        return left;
    }
}

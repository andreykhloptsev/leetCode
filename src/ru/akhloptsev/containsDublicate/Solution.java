package ru.akhloptsev.containsDublicate;

import java.util.*;

public class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length-1; i++) {
           if (!set.add(nums[i])){
               return true;
           }
        }
        return false;
    }
}

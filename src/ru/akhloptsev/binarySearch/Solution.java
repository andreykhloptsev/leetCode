package ru.akhloptsev.binarySearch;

public class Solution {


    public static void main(String[] args) {
        int num = 3;
        int target = 2;
        System.out.println(search(num, target));
    }

    public static int search(int num, int target) {
        int lastGood = 1;
        int firstBad = num;
        int middle;
        boolean middleVersion;
        while (firstBad - lastGood > 0) {
            middle = lastGood + (firstBad - lastGood)/2;
            middleVersion = isBadVersion(middle, target);
           if (!middleVersion) {
                lastGood = middle + 1;
            }  else {
                firstBad = middle ;
            }
        }
        if (isBadVersion(lastGood,target)){
            return lastGood;
        }
        return firstBad;
    }

    static boolean  isBadVersion(int middle, int target){
        System.out.println("call is bad Version "+ middle + " "+ (middle>= target));
        return  middle>= target;
    }
}

package ru.akhloptsev.Array.maxTurbArray;

public class Solution {

    public static void main(String[] args) {
            int[] arr = new int[]{9,4,2,10,7,8,8,1,9};
            int[] arr2 = new int[]{4,8,12,16};
            int[] arr3 = new int[]{4,4,4,4};
        System.out.println(maxTurbulenceSize(arr));
        System.out.println(maxTurbulenceSize(arr2));
        System.out.println(maxTurbulenceSize(arr3));
    }

    public static int maxTurbulenceSize(int[] arr) {
        int maxLength = 1, curLength = 1, currElem = arr[0], prevElement;
        Boolean direction = null;
        for (int i = 1; i < arr.length; i++) {
            prevElement = currElem;
            currElem = arr[i];
             if (currElem == prevElement){
                 curLength = 1;
             } else if (direction == null || (currElem - prevElement > 0) != direction) {
                curLength++;
                if (curLength > maxLength) {
                    maxLength = curLength;
                }
            } else {
                curLength = 2;
            }
            direction = (currElem - prevElement > 0);
        }
        return maxLength;
    }
}

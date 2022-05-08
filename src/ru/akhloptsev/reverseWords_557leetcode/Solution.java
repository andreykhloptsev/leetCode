package ru.akhloptsev.reverseWords_557leetcode;

public class Solution {

    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        System.out.println(reverseWords(s));
    }

    public static String reverseWords(String s) {
        var subStrings  = s.split(" ");
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < subStrings.length; i++) {
            stringBuilder.append(reverseWord(subStrings[i].toCharArray())).append(' ');
        }
        return stringBuilder.toString().trim();
    }

    private static char[] reverseWord(char[] subString) {
        int l = 0, r = subString.length-1;
        char temp ;
        while (r > l){
            temp = subString[l];
            subString[l] = subString[r];
            subString[r] = temp;
            r--;
            l++;
        }
        return subString;
    }
}

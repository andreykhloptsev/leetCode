package ru.akhloptsev.slidingWindow.substringWithoutRepeat;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public static void main(String[] args) {
        var s = "dvdf";
        var s1 = "bbbbb";
        var s2 = "pwwkew";
        System.out.println(lengthOfLongestSubstring(s));
        System.out.println(lengthOfLongestSubstring(s1));
        System.out.println(lengthOfLongestSubstring(s2));
    }

    public static int lengthOfLongestSubstring(String s) {
        var stringAsCharArray = s.toCharArray();
        Map<Character, Integer> characterMap = new HashMap<>();
        int longestSubString = 0, currentLength = 0, currentEnd = 0;
        Integer point;
        char currentElement;
        while (currentEnd < stringAsCharArray.length) {
            currentElement = stringAsCharArray[currentEnd];
            point = characterMap.put(currentElement, currentEnd);
            if (point == null) {
                currentLength++;
                if (currentLength > longestSubString) {
                    longestSubString = currentLength;
                }
            } else {
                currentLength = 0;
                characterMap.clear();
                currentEnd = point;
            }
            currentEnd++;
        }
        return longestSubString;
    }
}

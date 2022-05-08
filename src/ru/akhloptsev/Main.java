package ru.akhloptsev;

import ru.akhloptsev.romanToInteger.Solution;

public class Main {

	public static void main(String[] args) {
		runReverseVowels();
	}

    static void runRomanToInteger(){
        Solution solution = new Solution();
        System.out.println("result = " + solution.romanToInt("III"));
        System.out.println("result = " + solution.romanToInt("LVIII"));
        System.out.println("result = " + solution.romanToInt("MCMXCIV"));
    }

	static void runReverseVowels(){
		ru.akhloptsev.vowels.Solution solution = new ru.akhloptsev.vowels.Solution();
		System.out.println("result = " + solution.reverseVowels("Challenges for New Users"));
		System.out.println("result = " + solution.reverseVowels("leetcode"));
		System.out.println("result = " + solution.reverseVowels("wpl"));
	}
}

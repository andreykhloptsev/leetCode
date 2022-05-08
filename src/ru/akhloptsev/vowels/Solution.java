package ru.akhloptsev.vowels;

import java.util.Stack;

public class Solution {

	private final char[] vowels = {'a', 'e', 'u', 'i', 'o',
									'A', 'E', 'U', 'I', 'O'};

	public String reverseVowels(String s) {
		Stack<Character> vowelsStack = new Stack<>();
		for (int i = 0; i < s.length(); i++) {
			if (isVowel(s.charAt(i))) {
				vowelsStack.push(s.charAt(i));
			}
		}
		var result = new char[s.length()];
		for (int i = 0; i < s.length(); i++) {
			if (isVowel(s.charAt(i))) {
				result[i] = vowelsStack.pop();
			} else {
				result[i] = s.charAt(i);
			}
		}
		return new String(result);
	}

	private boolean isVowel(char letter) {
		for (char vowel : vowels) {
			if (letter == vowel) {
				return true;
			}
		}
		return false;
	}
}

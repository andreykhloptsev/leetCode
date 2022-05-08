package ru.akhloptsev.romanToInteger;

import java.util.HashMap;
import java.util.Map;

public class Solution {
	private static final String[] chars = {"I", "V", "X", "L", "C", "D", "M"};

	private static final String[] symbolCombinations = {"IV", "IX", "XL", "XC", "CD", "CM"};

	private final Map<String,Integer> valueMap = new HashMap<>();

	public int romanToInt(String s) {
		feelValueMap();
		validateString(s);
		return processString(s);
	}

	private Integer processString(String s) {
		int sum  = 0;
		for (String combo : symbolCombinations){
			if (s.contains(combo)){
				s = s.replaceFirst(combo,"");
				sum = sum+ valueMap.get(combo);
			}
		}
		for (int i = 0; i < chars.length ; i++) {
			var element = chars[i];
			if (s.contains(element)){
				s = s.replaceFirst(element,"");
				sum = sum+ valueMap.get(element);
				i--;
			}
		}
		return sum;
	}

	private void feelValueMap() {
		valueMap.put("I",1);
		valueMap.put("V",5);
		valueMap.put("X",10);
		valueMap.put("L",50);
		valueMap.put("C",100);
		valueMap.put("D",500);
		valueMap.put("M",1000);
		valueMap.put("IV",4);
		valueMap.put("IX",9);
		valueMap.put("XL",40);
		valueMap.put("XC",90);
		valueMap.put("CD",400);
		valueMap.put("CM",900);
	}

	void validateString(String s) {
		var stringArray = s.split("(?!^)");
		if (stringArray.length > 15) {
			throw new RuntimeException("To long string");
		}
		for (String letter : stringArray) {
			if (!contains(chars, letter)) {
				throw new RuntimeException("Incorrect symbols");
			}
		}
	}

	public static <T> boolean contains(final T[] array, final T v) {
		for (final T e : array) {
			if (e == v || v != null && v.equals(e)) {
				return true;
			}
		}
		return false;
	}
}

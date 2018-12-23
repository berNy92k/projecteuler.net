package inneRozwiazania_powtorka;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

// A palindromic number reads the same both ways. The largest palindrome made
// from the product of two 2-digit numbers is 9009 = 91 x 99.
//
// Find the largest palindrome made from the product of two 3-digit numbers.

public class LargestPalindromeProduct {

	public static void main(String[] args) {

		twoDigit();
		System.out.println(" - 2 digit");
		threeDigit();
		System.out.println(" - 3 digit");
	}

	private static void threeDigit() {
		int a = 100;
		int b = 1000;
		Map<Integer, String> palindrom2digit = new LinkedHashMap<>();

		for (int i = a; i < b; i++) {
			for (int j = a; j < b; j++) {
				int number = i * j;
				String stringOfNumber = String.valueOf(number);

				String ab = (String.valueOf(i) + " x " + String.valueOf(j));

				if (checkIfItIsPalindrome(stringOfNumber)) {
					palindrom2digit.put(number, ab);
				}
				;
			}
		}

		System.out.print(Collections.max(palindrom2digit.keySet()));
	}

	private static void twoDigit() {
		int a = 10;
		int b = 100;
		Map<Integer, String> palindrom2digit = new LinkedHashMap<>();

		for (int i = a; i < b; i++) {
			for (int j = a; j < b; j++) {
				int number = i * j;
				String stringOfNumber = String.valueOf(number);

				String ab = (String.valueOf(i) + " x " + String.valueOf(j));

				if (checkIfItIsPalindrome(stringOfNumber)) {
					palindrom2digit.put(number, ab);
				}
				;
			}
		}

		System.out.print(Collections.max(palindrom2digit.keySet()));
	}

	private static boolean checkIfItIsPalindrome(String stringOfNumber) {

		boolean truOrFalse = false;

		char[] charStringOfNumber = new char[stringOfNumber.length()];

		for (int i = 0; i <= stringOfNumber.length() - 1; i++) {
			charStringOfNumber[i] = stringOfNumber.charAt(stringOfNumber.length() - 1 - i);
		}

		if (stringOfNumber.equals(String.valueOf(charStringOfNumber))) {
			truOrFalse = true;
		}

		return truOrFalse;
	}

}

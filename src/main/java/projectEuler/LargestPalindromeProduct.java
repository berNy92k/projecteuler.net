package projectEuler;

//      A palindromic number reads the same both ways. The largest palindrome made
//      from the product of two 2-digit numbers is 9009 = 91 × 99.
//
//      Find the largest palindrome made from the product of two 3-digit numbers.

import java.util.*;

public class LargestPalindromeProduct {
    public static void main(String[] args) {

        System.out.println(palindrom2digit());
        theBiggest(palindrom2digit());

    }

    private static void theBiggest(Map<Integer, String> stringStringMap) {

        int max = 0;
        for (int i = 0; i < stringStringMap.size(); i++) {
            max = Collections.max(stringStringMap.keySet());
        }
        System.out.print("Largest palindrome made from the produck of dwo 2-digit numbers is: " + max + " = " + stringStringMap.get(max));
        System.out.println();
    }

    private static Map<Integer, String> palindrom2digit() {
        Map<Integer, String> palindromy2digit = new LinkedHashMap();

        int a = 10;
        while (a < 100) {

            for (int b = 10; b < 100; b++) {
                int digitTwoInt = a * b;
                String digitTwo = String.valueOf(a * b);

                char[] digitTwoCharReverse = new char[digitTwo.length()];

                for (int i = 0; i <= digitTwo.length() - 1; i++) {
                    digitTwoCharReverse[i] = digitTwo.charAt(digitTwo.length() - i - 1);
                }

                String digitTwoStringReverse = String.valueOf(digitTwoCharReverse);
                if (digitTwo.equals(digitTwoStringReverse)) {
                    palindromy2digit.put(digitTwoInt, (String.valueOf(a) + " * " + String.valueOf(b)));
                }

            }
            a++;
        }
        return palindromy2digit;

    }
}

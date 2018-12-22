

//      A palindromic number reads the same both ways. The largest palindrome made
//      from the product of two 2-digit numbers is 9009 = 91 × 99.
//
//      Find the largest palindrome made from the product of two 3-digit numbers.

import java.util.*;

public class LargestPalindromeProduct {
    public static void main(String[] args) {

        System.out.println(palindrom2digit());
        theBiggestOf2Digit(palindrom2digit());

        System.out.println();

        System.out.println(palindrom3digit());
        theBiggestOf3Digit(palindrom3digit());
    }

    private static void theBiggestOf3Digit(Map<Integer, String> integerStringMap) {
        int max = 0;
        for (int i = 0; i < integerStringMap.size(); i++) {
            max = Collections.max(integerStringMap.keySet());
        }
        System.out.print("Largest palindrome made from the produck of dwo 3-digit numbers is:  " + max + " = " + integerStringMap.get(max));
        System.out.println();
    }

    private static Map<Integer, String> palindrom3digit() {
        Map<Integer, String> palindromy3digit = new LinkedHashMap();

        int a = 100;
        while (a < 1000) {

            for (int b = 100; b < 1000; b++) {
                int digitThreeInt = a * b;
                String digiThree = String.valueOf(a * b);

                char[] digitThreeCharReverse = new char[digiThree.length()];

                for (int i = 0; i <= digiThree.length() - 1; i++) {
                    digitThreeCharReverse[i] = digiThree.charAt(digiThree.length() - i - 1);
                }

                String digitTwoStringReverse = String.valueOf(digitThreeCharReverse);
                if (digiThree.equals(digitTwoStringReverse)) {
                    palindromy3digit.put(digitThreeInt, (String.valueOf(a) + " * " + String.valueOf(b)));
                }
            }
            a++;
        }
        return palindromy3digit;
    }

    private static void theBiggestOf2Digit(Map<Integer, String> stringStringMap) {

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

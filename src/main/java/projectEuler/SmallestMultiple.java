package projectEuler;

//        2520 is the smallest number that can be divided by each of the numbers
//        from 1 to 10 without any remainder.
//
//        What is the smallest positive number that is evenly divisible
//        by all of the numbers from 1 to 20?

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

public class SmallestMultiple {
    public static void main(String[] args) {

        System.out.println("smallestMultipleOf1To10 is: " + smallestMultipleOf1To10());
        System.out.println("smallestMultipleOf1To20 is: " + smallestMultipleOf1To20());

    }
    private static Integer smallestMultipleOf1To20() {
        Set<Integer> smallestMultipleSet = new LinkedHashSet<>();
        for (int i = 1; i < 1000000000; i++) {
            if (i % 1 == 0 && i % 2 == 0 && i % 3 == 0 && i % 4 == 0 && i % 5 == 0 && i % 6 == 0 && i % 7 == 0 && i % 8 == 0 && i % 9 == 0 && i % 10 == 0 &&
            i % 11 == 0 && i % 12 == 0 && i % 13 == 0 && i % 14 == 0 && i % 15 == 0 && i % 16 == 0 && i % 17 == 0 && i % 18 == 0 && i % 19 == 0 && i % 20 == 0) {
                smallestMultipleSet.add(i);
            }
        }

        if (smallestMultipleSet.size() == 0){
            smallestMultipleSet.add(0);
        }
        Integer min = Collections.min(smallestMultipleSet);
        return min;
    }

    private static Integer smallestMultipleOf1To10() {
        Set<Integer> smallestMultipleSet = new LinkedHashSet<>();
        for (int i = 1; i < 10000; i++) {
                if (i % 1 == 0 && i % 2 == 0 && i % 3 == 0 && i % 4 == 0 && i % 5 == 0 && i % 6 == 0 && i % 7 == 0 && i % 8 == 0 && i % 9 == 0 && i % 10 == 0) {
                    smallestMultipleSet.add(i);
                }
        }
        Integer min = Collections.min(smallestMultipleSet);
        return min;
    }
}

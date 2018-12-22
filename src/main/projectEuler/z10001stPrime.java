

//        By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
//
//        What is the 10 001st prime number?

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

public class z10001stPrime {
    public static void main(String[] args) {

        long i = 2;
        long n = 1;
        Set<Long> longSet = new LinkedHashSet<>();

        while (n <= 10001) {
            int k = 0;
            for (long j = 2; j <= i; j++) {

                if (i % j == 0) {
                    k++;
                }
            }
            if (k == 1) {
                longSet.add(i);
                n++;
            }
            i++;
        }
        System.out.println(Collections.max(longSet));
    }
}

//    public static void main(String[] args) {
//
//        long i = 2;
//        long n = 1;
//        Set<Long> longSet = new LinkedHashSet<>();
//
//        while (n <= 6) {
//            int k = 0;
//            for (long j = 2; j <= i; j++) {
//
//                if (i % j == 0) {
//                    k++;
//                }
//            }
//            if (k == 1) {
//                longSet.add(i);
//                n++;
//            }
//            i++;
//        }
//        System.out.println(longSet);
//    }

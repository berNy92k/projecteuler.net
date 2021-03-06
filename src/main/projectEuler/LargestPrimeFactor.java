

//  The prime factors of 13195 are 5, 7, 13 and 29.
//
//  What is the largest prime factor of the number 600851475143 ?

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LargestPrimeFactor {
    public static void main(String[] args) {

        long number = 600851475143L;
        double pierwNumber = Math.sqrt(number);
        List<Long> liczbyPierwsze = new LinkedList<>();

        for (long i = 1; i <= pierwNumber; i++) {
            if (i != 1 && number % i == 0) {
                long k = 0;
                for (long j = 2; j <= i; j++) {
                    if (i % j == 0) {
                        k++;
                    }
                }
                if (k == 1) {
                    liczbyPierwsze.add(i);
                }
            }
        }

        if (liczbyPierwsze.size() == 0){
            liczbyPierwsze.add(0L);
        }

        System.out.println("All prime factors: " + liczbyPierwsze);
        System.out.println("The largest prime factor is: " + Collections.max(liczbyPierwsze));

    }
}

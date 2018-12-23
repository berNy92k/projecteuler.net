package inneRozwiazania_powtorka;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

//The prime factors of 13195 are 5, 7, 13 and 29.

// What is the largest prime factor of the number 600851475143 ?

public class LargestPrimeFactor {

	public static void main(String[] args) {
		
		long number = 600851475143L;
		double asd = Math.sqrt(number);
		List<Long> primeNumbers = new LinkedList<>();
		
		for (long i=2; i<=asd; i++) {
			if (number % i == 0) {
				long k = 0;
				for (long j=2; j<=i; j++) {
					if (i%j==0) {
						k++;
					}
				}
				if (k==1) {
					primeNumbers.add(i);
				}
			}
		}
		
		System.out.println(Collections.max(primeNumbers));
		System.out.println();
		System.out.println(primeNumbers);

	}

}

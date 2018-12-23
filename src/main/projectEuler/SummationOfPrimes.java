
//The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
//
//Find the sum of all the primes below two million.

public class SummationOfPrimes {

	public static void main(String[] args) {

		System.out.println("START");

		long a = 10;
		sumOfThePrimesNumber(a);

		System.out.println();

		long b = 2000000;
		sumOfThePrimesNumber(b);

		System.out.println("STOP");

	}

	private static void sumOfThePrimesNumber(long a) {

		long sum = 0;

		for (long i = 2; i < a; i++) {
			long k = 0;
			for (long j = 2; j <= i; j++) {
				if (i % j == 0) {
					k++;
				}
			}

			if (k == 1) {
				sum = sum + i;
			}
		}

		System.out.println(sum);

	}

}

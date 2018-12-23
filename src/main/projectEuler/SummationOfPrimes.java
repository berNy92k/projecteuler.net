
//The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
//
//Find the sum of all the primes below two million.

public class SummationOfPrimes {

	public static void main(String[] args) {

		System.out.println("START");

		int a = 10;
		sumOfThePrimesNumber(a);

		System.out.println();

		int b = 2000000;
		sumOfThePrimesNumber(b);

		System.out.println("STOP");

	}

	private static void sumOfThePrimesNumber(int a) {

		int sum = 0;

		for (int i = 2; i < a; i++) {
			int k = 0;
			for (int j = 2; j <= i; j++) {
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

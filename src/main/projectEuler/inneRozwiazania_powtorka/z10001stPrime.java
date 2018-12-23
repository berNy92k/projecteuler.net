package inneRozwiazania_powtorka;

public class z10001stPrime {

//	By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
//
//	What is the 10 001st prime number?

	public static void main(String[] args) {

		System.out.println("START");
		
		int a = 6;
		showMeThePrimeNumber(a);

		int b = 10001;
		showMeThePrimeNumber(b);
		
		System.out.println("STOP");
	}

	private static void showMeThePrimeNumber(int a) {

		int max = Integer.MAX_VALUE;

		int number = 0;
		int counter = 0;

		for (int i = 2; i <= max; i++) {
			int k = 0;
			
			for (int j = 2; j <= i; j++) {

				if (i % j == 0) {
					k++;
				}
			}

			if (k == 1) {
				number = i;
				counter++;
			}

			if (counter == a) {
				System.out.println(number);
				break;
			}
		}

	}

}

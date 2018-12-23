package inneRozwiazania_powtorka;

// If we list all the natural numbers below 10 that are multiples of 3 or 5,
// we get 3, 5, 6 and 9. The sum of these multiples is 23.
//
// Find the sum of all the multiples of 3 or 5 below 1000.

public class MultiplesOf3and5 {

	public static void main(String[] args) {

		System.out.println("Sum of all the multiples of 3 or 5 below 10:");
		System.out.println(from0to10());

		System.out.println();

		System.out.println("Sum of all the multiples of 3 or 5 below 1000:");
		System.out.println(from0to1000());

	}

	private static int from0to10() {
		int a = 3;
		int b = 5;
		int c = 10;

		int sum = 0;

		for (int i = 0; i < c; i++) {
			if (i % a == 0 || i % b == 0) {
				sum = sum + i;
			}
		}

		return sum;
	}

	private static int from0to1000() {
		int a = 3;
		int b = 5;
		int c = 1000;
		int sum = 0;
		
		for (int i = 0; i < c; i++) {
			if (i % a == 0 || i % b == 0) {
				sum = sum + i;
			}
		}

		return sum;
	}
}

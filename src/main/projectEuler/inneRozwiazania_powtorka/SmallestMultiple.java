package inneRozwiazania_powtorka;

// 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
//
// What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?

public class SmallestMultiple {

	public static void main(String[] args) {

		smallestMultiple1to10();
		System.out.println(" - 1 to 10");
		smallestMultiple1to20();
		System.out.println(" - 1 to 20");

	}

	private static void smallestMultiple1to10() {
		int a = 1;
		int b = 10;

		int max = Integer.MAX_VALUE;

		for (int i = 1; i <= max; i++) {
			int k = 0;

			for (int j = a; j <= b; j++) {

				if (i % j == 0) {
					k++;
				}

			}

			if (k == b) {
				System.out.print(i);
				break;
			}
		}
	}
	
	private static void smallestMultiple1to20() {
		int a = 1;
		int b = 20;

		int max = Integer.MAX_VALUE;

		for (int i = 1; i <= max; i++) {
			int k = 0;

			for (int j = a; j <= b; j++) {

				if (i % j == 0) {
					k++;
				}

			}

			if (k == b) {
				System.out.print(i);
				break;
			}
		}
	}

}
package inneRozwiazania_powtorka;

// A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
//
// a2 + b2 = c2
// For example, 32 + 42 = 9 + 16 = 25 = 52.
//
// There exists exactly one Pythagorean triplet for which a + b + c = 1000.
// Find the product abc.

public class SpecialPythagoreanTriplet {

	public static void main(String[] args) {
		int a = 1000;
		findTheProductABC(a);

	}

	private static void findTheProductABC(int a) {

		for (int i = 1; i <= a; i++) {
			for (int j = 1; j <= a; j++) {
				for (int k = 1; k <= a; k++) {
					if (i < j && j < k && (Math.pow(i, 2) + Math.pow(j, 2) == (Math.pow(k, 2)))) {
						if (i + j + k == 1000) {
							System.out.println("i = " + i);
							System.out.println("j = " + j);
							System.out.println("l = " + k);
							System.out.println("The product abc: " + i * j * k);
						}
					}
				}
			}
		}

	}

}

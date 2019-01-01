import java.util.HashMap;
import java.util.Map;

/*

The following iterative sequence is defined for the set of positive integers:

n → n/2 (n is even)
n → 3n + 1 (n is odd)

Using the rule above and starting with 13, we generate the following sequence:

13 → 40 → 20 → 10 → 5 → 16 → 8 → 4 → 2 → 1
It can be seen that this sequence (starting at 13 and finishing at 1) contains 10 terms. 
Although it has not been proved yet (Collatz Problem), it is thought that all starting numbers finish at 1.

Which starting number, under one million, produces the longest chain?

NOTE: Once the chain starts the terms are allowed to go above one million.

 */

public class LongestCollatzSequence {

	public static void main(String[] arg) {
		final long a = 837799;

		long lenghtSeq = Integer.MIN_VALUE;
		long startingNumber = Integer.MIN_VALUE;

		for (int i = 2; i <= a; i++) {
			long counter = 1;
			long c = i;

			while (c > 1) {
				if ((c % 2) == 0) {
					c = c / 2;
				} else {
					c = 3 * c + 1;
				}
				counter++;
			}

			if (counter > lenghtSeq) {
				lenghtSeq = counter;
				startingNumber = i;
			}
		}
		System.out.println(lenghtSeq + ": " + startingNumber);

	}

}

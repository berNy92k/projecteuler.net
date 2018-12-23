package inneRozwiazania_powtorka;

/*
The sum of the squares of the first ten natural numbers is,
1^2 + 2^2 + ... + 10^2 = 385

The square of the sum of the first ten natural numbers is,
(1 + 2 + ... + 10)^2 = 55^2 = 3025

Hence the difference between the sum of the squares of the first ten natural numbers 
and the square of the sum is 3025 - 385 = 2640.

Find the difference between the sum of the squares of the first one hundred 
natural numbers and the square of the sum.
*/

public class SumSquareDifference {

	public static void main(String[] args) {

		sumOfTheSquaresFirst10NaturalNumber();
		squareOfTheSumFirst10NaturalNumber();
		System.out.println(
				diffrenceBetweenNatNb(sumOfTheSquaresFirst10NaturalNumber(), squareOfTheSumFirst10NaturalNumber()));

		sumOfTheSquaresFirst100NaturalNumber();
		squareOfTheSumFirst100NaturalNumber();
		System.out.println(
				diffrenceBetweenNatNb(sumOfTheSquaresFirst100NaturalNumber(), squareOfTheSumFirst100NaturalNumber()));

	}

	private static int sumOfTheSquaresFirst100NaturalNumber() {
		int a = 1;
		int b = 100;

		int sum = 0;

		for (int i = a; i <= b; i++) {
			sum = sum + (int) Math.pow(i, 2);
		}

		return sum;

	}

	private static int squareOfTheSumFirst100NaturalNumber() {
		int a = 1;
		int b = 100;

		int sum = 0;

		for (int i = a; i <= b; i++) {
			sum = sum + i;
		}

		int squareOfTheSumFirst10NaturalNumber = (int) (Math.pow(sum, 2));

		return squareOfTheSumFirst10NaturalNumber;
	}

	private static int diffrenceBetweenNatNb(int sumOfTheSquaresFirst10NaturalNumber,
			int squareOfTheSumFirst10NaturalNumber) {

		return squareOfTheSumFirst10NaturalNumber - sumOfTheSquaresFirst10NaturalNumber;
	}

	private static int squareOfTheSumFirst10NaturalNumber() {
//		The square of the sum of the first ten natural numbers is,
//		(1 + 2 + ... + 10)^2 = 55^2 = 3025

		int a = 1;
		int b = 10;

		int sum = 0;

		for (int i = a; i <= b; i++) {
			sum = sum + i;
		}

		int squareOfTheSumFirst10NaturalNumber = (int) (Math.pow(sum, 2));

		return squareOfTheSumFirst10NaturalNumber;

	}

	private static int sumOfTheSquaresFirst10NaturalNumber() {
//		The sum of the squares of the first ten natural numbers is,
//		1^2 + 2^2 + ... + 10^2 = 385

		int a = 1;
		int b = 10;

		int sum = 0;

		for (int i = a; i <= b; i++) {
			sum = sum + (int) Math.pow(i, 2);
		}

		return sum;

	}

}

package projectEuler;

/*
The sum of the squares of the first ten natural numbers is,
1^2 + 2^2 + ... + 10^2 = 385

The square of the sum of the first ten natural numbers is,
(1 + 2 + ... + 10)^2 = 55^2 = 3025

Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 − 385 = 2640.

Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
*/


public class SumSquareDiffrence {
    public static void main(String[] args) {

        theSumOfTheSquaresOfTheFirstTenNaturalNumbers();
        theSquareOfTheSumOfTheFirstTenNaturalNumbers();
        henceTheDifferenceBetweenTheSumOfTheSquaresOfTheFirstTenNaturalNumbers(theSumOfTheSquaresOfTheFirstTenNaturalNumbers(),theSquareOfTheSumOfTheFirstTenNaturalNumbers());
    }

    private static int henceTheDifferenceBetweenTheSumOfTheSquaresOfTheFirstTenNaturalNumbers(int theSumOfTheSquaresOfTheFirstTenNaturalNumbers, int theSquareOfTheSumOfTheFirstTenNaturalNumbers) {
        int result = 0;

        return result;
    }

    private static int theSquareOfTheSumOfTheFirstTenNaturalNumbers() {
        int theSquareOfSum = 0;

        return theSquareOfSum;
    }

    private static int theSumOfTheSquaresOfTheFirstTenNaturalNumbers() {
        int theSumOfSquares = 0;

        return theSumOfSquares;
    }
}



/*
The sum of the squares of the first ten natural numbers is,
1^2 + 2^2 + ... + 10^2 = 385

The square of the sum of the first ten natural numbers is,
(1 + 2 + ... + 10)^2 = 55^2 = 3025

Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 �?� 385 = 2640.

Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
*/


public class SumSquareDiffrence {
    public static void main(String[] args) {
        tenNaturalNumbers();
        System.out.println();
        hundredNaturalNumbers();
    }

    private static void hundredNaturalNumbers() {
        System.out.printf("%.0f%n", theSumOfTheSquaresOfTheFirstHundredNaturalNumbers());
        System.out.printf("%.0f%n", theSquareOfTheSumOfTheFirstHundredNaturalNumbers());
        System.out.printf("%.0f%n", henceTheDifferenceBetweenTheSumOfTheSquaresOfTheFirstHundredNaturalNumbers(theSumOfTheSquaresOfTheFirstHundredNaturalNumbers(), theSquareOfTheSumOfTheFirstHundredNaturalNumbers()));
    }

    private static double henceTheDifferenceBetweenTheSumOfTheSquaresOfTheFirstHundredNaturalNumbers(double theSumOfTheSquaresOfTheFirstHundredNaturalNumbers, double theSquareOfTheSumOfTheFirstHundredNaturalNumbers) {
        double result = theSquareOfTheSumOfTheFirstHundredNaturalNumbers - theSumOfTheSquaresOfTheFirstHundredNaturalNumbers;
        return result;
    }

    private static double theSquareOfTheSumOfTheFirstHundredNaturalNumbers() {
        int b = 2;
        int sum = 0;

        for (int i = 1; i <= 100; i++) {
            sum = sum + i;
        }
        double theSquareOfSum = Math.pow((sum), b);

        return theSquareOfSum;
    }

    private static double theSumOfTheSquaresOfTheFirstHundredNaturalNumbers() {
        int b = 2;
        double theSumOfSquares = 0;
        for (int i = 1; i <= 100; i++) {
            theSumOfSquares = theSumOfSquares + Math.pow(i, b);
        }

        return theSumOfSquares;
    }


    private static void tenNaturalNumbers() {
        System.out.println(theSumOfTheSquaresOfTheFirstTenNaturalNumbers());
        System.out.println(theSquareOfTheSumOfTheFirstTenNaturalNumbers());
        System.out.println(henceTheDifferenceBetweenTheSumOfTheSquaresOfTheFirstTenNaturalNumbers(theSumOfTheSquaresOfTheFirstTenNaturalNumbers(), theSquareOfTheSumOfTheFirstTenNaturalNumbers()));
    }

    private static double henceTheDifferenceBetweenTheSumOfTheSquaresOfTheFirstTenNaturalNumbers(double theSumOfTheSquaresOfTheFirstTenNaturalNumbers, double theSquareOfTheSumOfTheFirstTenNaturalNumbers) {
        double result = theSquareOfTheSumOfTheFirstTenNaturalNumbers - theSumOfTheSquaresOfTheFirstTenNaturalNumbers;
        return result;
    }

    private static double theSquareOfTheSumOfTheFirstTenNaturalNumbers() {
        int b = 2;
        double theSquareOfSum = Math.pow((1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10), b);

        return theSquareOfSum;
    }

    //    The sum of the squares of the first ten natural numbers is,
//    1^2 + 2^2 + ... + 10^2 = 385
    private static double theSumOfTheSquaresOfTheFirstTenNaturalNumbers() {
        int b = 2;
        double theSumOfSquares = Math.pow(1, b) + Math.pow(2, b) + Math.pow(3, b) + Math.pow(4, b) + Math.pow(5, b) + Math.pow(6, b) + Math.pow(7, b) + Math.pow(8, b) + Math.pow(9, b) + Math.pow(10, b);

        return theSumOfSquares;
    }
}

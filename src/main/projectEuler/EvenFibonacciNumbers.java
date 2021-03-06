
// Each new term in the Fibonacci sequence is generated by adding the previous two terms.
// By starting with 1 and 2, the first 10 terms will be:
//
//        1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
//
// By considering the terms in the Fibonacci sequence whose values do not exceed four million,
// find the sum of the even-valued terms.

// answer: 4613732



public class EvenFibonacciNumbers {
    public static void main(String[] args) {

        System.out.println("Suma ciagu Finbonaciego dla kt�rej nie przekracza 4 milion�w - parzystych liczb");

        System.out.println();

        if (fibonacciResult() == 4613732) {
            System.out.println("Odpowiedź poprawna - " + fibonacciResult());
        } else {
            System.out.println("Odpowiedź niepoprawna - powinna być - 4613732, jest: " + fibonacciResult());
        }

    }

    private static long fibonacciResult() {
        long f0 = 0;
        long f1 = 1;
        long result = 0;
        long evenResult = 0;
        int n = 0;

        while (evenResult < 4000000) {

            if (n == 0) {
                result = f0;
            } else if (n == 1) {
                result = f1;
            } else if (n >= 2) {
                result = f0 + f1;
                f0 = f1;
                f1 = result;
                if (f0 % 2 == 0) {
                    evenResult = evenResult + f0;
                }
            }
            n++;
        }

        return evenResult;
    }
}

//    public static void main(String[] args) {
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Podaj liczbę w ciągu Fibonacciego");
//        long n = scanner.nextInt();
//        System.out.println(fibonacciResult(n));
//
//    }
//
//    private static long fibonacciResult(long n) {
//        long f0 = 0;
//        long f1 = 1;
//        long result = 0;
//
//        for (int i = 0; i < n; i++) {
//            if (n == 0) {
//                result = f0;
//            } else if (n == 1) {
//                result = f1;
//            } else if (n >= 2) {
//                f0 = f1;
//                f1 = result;
//                result = f0 + f1;
//            }
//        }
//        return result;
//    }

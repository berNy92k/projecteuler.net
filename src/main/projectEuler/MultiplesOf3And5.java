

//  If we list all the natural numbers below 10 that are multiples of 3 or 5,
//  we get 3, 5, 6 and 9. The sum of these multiples is 23.
//
//  Find the sum of all the multiples of 3 or 5 below 1000.

public class MultiplesOf3And5 {
    public static void main(String[] args) {

        System.out.println("Sum of all the multiples of 3 or 5 below 10:");
        System.out.println(from0to10());

        System.out.println();

        System.out.println("Sum of all the multiples of 3 or 5 below 1000:");
        System.out.println(from0to1000());

    }

    private static int from0to10() {
        int n = 0;
        int m = 10;
        int sum = 0;
        while (n < m){
            if (n%3==0 || n%5==0){
                sum = sum + n;
            }
            n++;
        }
        return sum;
    }

    private static int from0to1000() {
        int n = 0;
        int m = 1000;
        int sum = 0;
        while (n < m){
            if (n%3==0 || n%5==0){
                sum = sum + n;
            }
            n++;
        }
        return sum;
    }
}

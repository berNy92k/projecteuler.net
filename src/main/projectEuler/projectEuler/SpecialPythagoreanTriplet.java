package projectEuler;

/*
A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,

a^2 + b&2 = c&2
For example, 3^2 + 4^2 = 9 + 16 = 25 = 5^2.

There exists exactly one Pythagorean triplet for which a + b + c = 1000.
Find the product abc.
 */
public class SpecialPythagoreanTriplet {
    public static void main(String[] args) {

        example();
        pythagoreanTriplet1000();

    }

    private static void pythagoreanTriplet1000() {
        int k = 1000;
        int m = 2;


        for (int i = 1; i < k; i++) {
            for (int j = 1; j < k; j++) {
                for (int l = 1; l < k; l++) {
                    if (i < j && j < l && (Math.pow(i, m) + Math.pow(j, m) == Math.pow(l, m))) {
                        if (i + j + l == 1000) {
                            System.out.println("i = " + i);
                            System.out.println("j = " + j);
                            System.out.println("l = " + l);
                            System.out.println("The product abc: " + i * j * l);
                        }
                    }
                }
            }
        }
    }

    private static void example() {
        int k = 10;
        int m = 2;

        for (int i = 1; i < k; i++) {
            for (int j = 1; j < k; j++) {
                for (int l = 1; l < k; l++) {
                    if (i < j && j < l && (Math.pow(i, m) + Math.pow(j, m) == Math.pow(l, m))) {
                        System.out.println(Math.pow(i, m) + " | i = " + i);
                        System.out.println(Math.pow(j, m) + " | j = " + j);
                        System.out.println(Math.pow(l, m) + " | l = " + l);
                        System.out.println();
                    }
                }
            }
        }
    }
}

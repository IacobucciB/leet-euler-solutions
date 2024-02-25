package Euler2;

public class Euler22 {

    public static void main(String args[]) {

        int limit = 4000000;
        int sum = 0;

        int f0 = 2;
        int f1 = 8;
        int fn = 0;

        do {

            if (fn % 2 == 0) {
                sum = sum + fn;
            }

            fn = f0 + 4 * f1;
            f0 = f1;
            f1 = fn;

        } while (fn < limit);

        System.out.println(sum);
    }

}

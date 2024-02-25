package Euler3;

public class Euler3 {
    public static void main(String args[]) {

        long n = 600851475143L;
        double limitD = Math.sqrt((double) n);
        int limit = (int) limitD;

        for (int i = 0; i <= limit; i++) {
            if (isPrime(i)) {
                if (limit % i == 0) {
                    System.out.println(i);
                }
            }
        }
    }

    public static boolean isPrime(int x) {
        if (x <= 1) {
            return false;
        }
        if (x <= 3) {
            return true;
        }
        if (x % 2 == 0 || x % 3 == 0) {
            return false;
        }
        // Check divisibility by xs of the form 6k ± 1 up to sqrt(x)
        for (int i = 5; i * i <= x; i += 6) {
            if (x % i == 0 || x % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }
}

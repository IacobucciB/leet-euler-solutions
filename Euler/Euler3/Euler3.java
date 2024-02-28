package Euler3;

public class Euler3 {
    public static void main(String args[]) {

        long n = 600851475143L;
        double limitD = Math.sqrt((double) n);
        int limit = (int) limitD;
        System.out.println(limit);

        for (int i = 0; i <= limit; i++) {
            if (isPrime(i)) {
                if (limit % i == 0) {
                    System.out.println(i);
                }
            }
        }
    }

    public static boolean isPrime(int x) {
        return false;
    }
}

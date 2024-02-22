package Euler1;

class Euler1 {

    public static void main(String args[]) {
        System.out.println("Test");

        int limit = 1000;
        int sum = 0;

        for(int i = 1; i<limit; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum = sum + i;
            }
        }   

        System.out.println(sum);
    }
}
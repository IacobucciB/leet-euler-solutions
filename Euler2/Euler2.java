package Euler2;

public class Euler2 {

    public static void main(String args[]) {
    
        int limit = 250;
    
        int n1 = 0;
        int n2 = 1;
        int fib = 0;
        while(fib < limit) {
            fib = n1 + n2;
            n1 = n2;
            n2 = fib;
            

            System.out.println(fib);
        } 
    }
}

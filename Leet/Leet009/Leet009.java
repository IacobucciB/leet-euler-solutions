package Leet.Leet009;

public class Leet009 {

    public static void main(String[] args) {

        int numeros[] = { 121, -121, 10, 3333 };

        for (int i = 0; i < numeros.length; i++) {
            System.out.print(isPalindrome(numeros[i]) + " ");
        }

    }

    public static boolean isPalindrome(int x) {

        if (x < 0) {
            return false;
        }

        int reverse = 0;
        int aux = x;

        while (aux != 0) {
            int digit = aux % 10;
            reverse = reverse * 10 + digit;
            aux = aux / 10;
        }

        return reverse == x;

    }

}

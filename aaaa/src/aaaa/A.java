package aaaa;

import java.util.Arrays;

public class A {
    public static void main(String[] args) {
        int[] array = new int[] { 9, 2, 3 };
        System.out.print(isOdd(-1));
        System.out.println();
        System.out.print(isPrime(10));
        System.out.println();
        System.out.print(min(array));
        System.out.println();
        System.out.print(kthMin(3, array));
        System.out.println();
        System.out.print(getAverage(array));
        System.out.println();
        System.out.print(doubleFac(3));
    }

    private static boolean isOdd(int n) {
        if (n % 2 != 0) {
            return true;
        }
        return false;
    }

    private static boolean isPrime(int n) {
        if (n % 2 == 0 || n % 5 == 0 || n % 3 == 0) {
            return false;
        }
        return true;
    }

    private static int min(int[] array) {
        Arrays.sort(array);
        return array[0];
    }

    private static int kthMin(int k, int[] array) {
        Arrays.sort(array);
        return array[k - 1];
    }

    private static int getAverage(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum / array.length;
    }

    private static long doubleFac(int n) {
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        int doubleFac = 1;
        for (int i = 1; i <= factorial; i++) {
            doubleFac *= i;
        }
        return doubleFac;
    }

    private static int getOddOccurrence(int[] array){
        
    }
}

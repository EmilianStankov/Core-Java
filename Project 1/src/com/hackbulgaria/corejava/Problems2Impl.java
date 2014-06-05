package com.hackbulgaria.corejava;

import java.util.Arrays;

public class Problems2Impl implements Problems2 {

    @Override
    public boolean isOdd(int number) {
        if (number % 2 != 0) {
            return true;
        }
        return false;
    }

    @Override
    public boolean isPrime(int number) {
        if ((number % 2 == 0 || number % 5 == 0 || number % 3 == 0) && (number != 5 && number != 3)) {
            return false;
        }
        return true;
    }

    @Override
    public int min(int... array) {
        Arrays.sort(array);
        return array[0];
    }

    @Override
    public int kthMin(int k, int[] array) {
        Arrays.sort(array);
        return array[k - 1];
    }

    @Override
    public float getAverage(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum / array.length;
    }

    @Override
    public long getSmallestMultiple(int upperBound) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public long getLargestPalindrome(long N) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int[] histogram(short[][] image) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public long doubleFac(int n) {
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

    @Override
    public long kthFac(int k, int n) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int getOddOccurrence(int[] array) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public long pow(int a, int b) {
        int result = a;
        if (b > 0) {
            for (int i = 0; i < b; i++) {
                result *= a;
            }
        }
        if (b == 0) {
            return 1;
        }
        return result;
    }

    @Override
    public long maximalScalarSum(int[] a, int[] b) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int maxSpan(int[] array) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public boolean canBalance(int[] array) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public int[][] rescale(int[][] original, int newWidth, int newHeight) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String reverseMe(String argument) {
        String result = "";
        for (int i = argument.length() - 1; i >= 0; i--) {
            result += argument.toCharArray()[i];
        }
        return result;
    }

    @Override
    public String copyEveryChar(String input, int k) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String reverseEveryWord(String arg) {
        String[] words = arg.split("\\s+");
        String[] reversedWords = new String[words.length];
        String result = "";
        for (int i = 0; i < words.length; i++) {
            reversedWords[i] = reverseMe(words[i]);
        }
        for (int i = 0; i < reversedWords.length; i++) {
            result = result + reversedWords[i] + ' ';
        }
        return result.substring(0, result.length() - 1);
    }

    @Override
    public boolean isPalindrome(String argument) {
        if (argument.length() % 2 == 0) {
            String lhs = argument.substring(0, argument.length() / 2);
            String rhs = reverseMe(argument.substring(argument.length() / 2, argument.length()));
            if (lhs.equals(rhs)) {
                return true;
            }
        } else {
            String lhs = argument.substring(0, argument.length() / 2);
            String rhs = reverseMe(argument.substring(argument.length() / 2 + 1, argument.length()));
            if (lhs.equals(rhs)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean isPalindrome(int number) {
        String numberString = new Integer(number).toString();
        return isPalindrome(numberString);
    }

    @Override
    public int getPalindromeLength(String input) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int countOcurrences(String needle, String haystack) {
        return haystack.split(needle, -1).length - 1;
    }

    @Override
    public String decodeURL(String input) {
        return input.replace("%20", " ").replace("%3A", ":").replace("%3D", "?").replace("%2F", "/");
    }

    @Override
    public int sumOfNumbers(String input) {
        String numbersInput = input.replaceAll("[^\\-0123456789]", " ");
        String[] numbers = numbersInput.split("\\s+");
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (!numbers[i].equals("")) {
                sum += Integer.parseInt(numbers[i]);
            }
        }
        return sum;
    }

    @Override
    public boolean areAnagrams(String A, String B) {
        boolean areAnagrams = true;
        char[] AChars = new char[A.length()];
        char[] BChars = new char[B.length()];
        for (int i = 0; i < A.length(); i++) {
            AChars[i] = A.charAt(i);
        }
        for (int i = 0; i < B.length(); i++) {
            BChars[i] = B.charAt(i);
        }
        Arrays.sort(AChars);
        Arrays.sort(BChars);
        for (int i = 0; i < AChars.length; i++) {
            if (AChars[i] != BChars[i]) {
                areAnagrams = false;
            }
        }
        return areAnagrams;
    }

    @Override
    public boolean hasAnagramOf(String string, String string2) {
        // TODO Auto-generated method stub
        return false;
    }

}

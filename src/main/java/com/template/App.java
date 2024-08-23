package com.template;

public class App {

    // 1. Sum of Two Integers
    public int sum(int a, int b) {
        int c = a + b;
        return c;
    }

    // 2. Check Even or Odd
    public boolean isEven(int number) {
        // TODO: Implement this method
        if (number % 2 == 0){
        return true;
        }else{
            return false;
        }
    }

    // 3. Maximum of Two Numbers
    public int max(int a, int b) {
        // TODO: Implement this method
        if (a > b){
            return a;
        }else{
            return b;
        }

    }

    // 4. Factorial of a Number
    public int factorial(int n) {
        // TODO: Implement this method
        if (n == 1){
            return 1;
        }
        return n * factorial(n - 1);
    }

    // 5. Count Characters in a String
    public int countChars(String input) {
        int t = input.length();
        return t;
    }

    // 6. Reverse a String
    public String reverse(String input) {

        return "";
    }

    // 7. Check Prime Number
    public boolean isPrime(int number) {
        // TODO: Implement this method
        return false;
    }

    // 8. Find the Smallest Element in an Array
    public int findMin(int[] array) {
        // TODO: Implement this method
        return 0;
    }

    // 9. Sum of Elements in an Array
    public int arraySum(int[] array) {
        // TODO: Implement this method
        return 0;
    }

    // 10. Convert Celsius to Fahrenheit
    public double celsiusToFahrenheit(double celsius) {
        // TODO: Implement this method
        return 0.0;
    }
}

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
        if (n == 0 || n == 1) {
            return 1;
        }
        int result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }


    // 5. Count Characters in a String
    public int countChars(String input) {
        int t = input.length();
        return t;
    }

    // 6. Reverse a String
    public String reverse(String input) {
        StringBuilder reversed = new StringBuilder(input);
    return reversed.reverse().toString();
    }

    // 7. Check Prime Number
    public boolean isPrime(int number) {
        // TODO: Implement this method
        if (number <= 1) {
            return false;
        }
        if (number == 2) {
            return true; // 2 es el único número primo par.
        }
        if (number % 2 == 0) {
            return false; // Descarta todos los números pares mayores que 2.
        }
        for (int i = 3; i <= Math.sqrt(number); i += 2) {
            if (number % i == 0) {
                return false; // Si se encuentra un divisor, el número no es primo.
            }
        }
        return true; // Si no se encuentran divisores, el número es primo.
    }

    // 8. Find the Smallest Element in an Array
    public int findMin(int[] array) {
        // TODO: Implement this method
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("El arreglo no puede ser nulo o estar vacío.");
        }

        int min = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }

        return min;
    }

    // 9. Sum of Elements in an Array
    public int arraySum(int[] array) {
        // TODO: Implement this method
        if (array == null) {
            throw new IllegalArgumentException("El arreglo no puede ser nulo.");
        }

        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        return sum;
    }

    // 10. Convert Celsius to Fahrenheit
    public double celsiusToFahrenheit(double celsius) {
        // TODO: Implement this method
        return (celsius * 9/5) + 32;
    }
}

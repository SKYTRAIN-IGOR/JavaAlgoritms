// Explanation:- https://en.wikipedia.org/wiki/Fibonacci_sequence#Binet's_formula
package com.thealgorithms.maths;

public final class FibonacciNumber {
    private FibonacciNumber() {
    }

    // Compute the limit for 'n' that fits in a long data type.
    // Reducing the limit to 70 due to potential floating-point arithmetic errors
    // that may result in incorrect results for larger inputs.
    public static final int MAX_ARG = 70;

    public static long nthFibonacci(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Input 'n' must be a non-negative integer.");
        }

        if (n > argLimit) {
            throw new IllegalArgumentException("Input 'n' is too large!"); // Check if 'n' exceeds the range that can be accommodated by a long data type.
        }

        if (n <= 1) {
            return n;
        }

        // Calculate the nth Fibonacci number using the golden ratio formula
        final double sqrt5 = Math.sqrt(5);
        final double phi = (1 + sqrt5) / 2;
        final double psi = (1 - sqrt5) / 2;
        final double result = (Math.pow(phi, n) - Math.pow(psi, n)) / sqrt5;

        // Round to the nearest integer and convert to BigInteger
        return Math.round(result);
    }
}

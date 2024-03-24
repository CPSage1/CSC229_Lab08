/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MoaathAlrajab
 */
public class Problem01 {

    public static long getSumOfPrimes(int n){
        // Todo 04: Develop a method that returns the sum of the prime numbers between 1 and n
        //          Test your solution
        //          Analyze its space and time

        // Initializes an array to track the prime numbers
        boolean[] primes = new boolean[n + 1];
        long sum = 0;

        // Marks all numbers as prime numbers
        for (int i = 2; i <= n; i++) {
            primes[i] = true;
        }

        // Sieve of Eratosthenes algorithm to mark non prime numbers
        for (int p = 2; p * p <= n; p++) {
            if (primes[p]) {
                // Marks multiples of p as non prime
                for (int i = p * p; i <= n; i += p) {
                    primes[i] = false;
                }
            }
        }

        // Calculates the sum of all the prime numbers
        for (int i = 2; i <= n; i++) {
            if (primes[i]) {
                sum += i;
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        int n = 10; // Sum of primes between 1 and 10
        long sum = getSumOfPrimes(n);
        System.out.println("The sum of primes between 1 and " + n + ": " + sum);
    }
}
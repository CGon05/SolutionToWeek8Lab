/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.week8_skeletoncode_lab;
/**
 *
 * @author MoaathAlrajab
 */
public class Problem01 {

    public static long getSumOfPrimes(int n) {
        // Todo 04: Develop a method that returns the sum of the prime numbers between 1 and n
        //          Test your solution
        //          Analyze its space and time  

        boolean prime[] = new boolean[n + 1];

        for (int p = 2; p * p <= n; p++) {

            if (prime[p] == true) {

                for (int i = p * 2; i <= n; i += p) {
                    prime[i] = false;
                }
            }
        }

        int sum = 0;
        for (int i = 2; i <= n; i++) {
            if (prime[i]) {
                sum += i;
            }
        }
        return sum;
    }

}

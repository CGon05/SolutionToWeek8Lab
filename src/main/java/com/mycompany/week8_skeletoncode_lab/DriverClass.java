/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.week8_skeletoncode_lab;

/**
 *
 * @author cgonc
 */
public class DriverClass {
    public static void main(String[] args) {
        
        int[] Array ={22, 34, 55, 65, 67, 78, 84};
        int[] Array2 ={22, 34, 67, 65, 55, 78, 84};
        
        BinarySearch bs = new BinarySearch();
        LinearSearch ls = new LinearSearch();
        Problem01 p01 = new Problem01();
        BubbleSort BS = new BubbleSort();
        
        //1
        System.out.println(bs.runBinarySearchIteratively(Array, 55, 0, Array.length));
        System.out.println("34 is at index: " + ls.search(Array,34));
        System.out.println("The sum of primes of 20 is: " + p01.getSumOfPrimes(20));
        BS.bubbleSort(Array2, Array2.length);
        BS.printArray(Array2, Array2.length);
        
    }
}

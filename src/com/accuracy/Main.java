// Java program to demonstrate strictfp modifier
package com.accuracy;

/**
 * This is Main method to calculate sum of two numbers a and b
 *
 * @autor Julia Marushchenko
 * @version 1.0
 * @since 2025-04-28
 */
public class Main {

    /**
     * This is sum method to calculate sum very accurate
     * @param a This is double number
     * @param b This is double number
     * @return Sum of a and b
     */
    public static strictfp double sum(double a, double b){
        return  a + b;
    }

    /**
     *This is a main method to run java program
     * @param args Unused
     * @return Nothing
     */
    public static void main(String[] args) {

        System.out.println(Main.sum(3.5, 5.3));
    }
}
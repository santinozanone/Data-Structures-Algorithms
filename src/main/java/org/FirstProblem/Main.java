package org.FirstProblem;

public class Main {
    /*
        Write a recursive function that computes the sum of all numbers from 1 to n, where n is given as parameter.
        return the sum 1+ 2+ 3+ ...+ n
        int sum(int n)
    */
    public static void main(String[] args) {
        System.out.println(sum(5));
    }

    public static int sum(int n){
        if (n == 1) return 1;
        return n +(sum(n-1));

    }
}
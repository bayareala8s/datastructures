package com.bayareala8s.twosum;

public class App {

    /*
        The two sum problem is a common interview question
        It is very similar to subset sum problem

        The Problem: find all the pairs of 2 integers in an unsorted array of
        integers that sum up to a given s

        [1,2,3,4] is the array and S = 5 ---> [1,4] & [2,3] are the solutions.

        - The naive solution has O(N^2) running time
        - We can use dynamic programming to reduce the running time to O(N) linear running time

    */

    public static void main(String[] args) {

        int[] nums = {3,5,2,-4,8,11};
        int sum = 7;

        NaiveSolution naiveSolution = new NaiveSolution(nums, sum);
        naiveSolution.solve();

    }

}

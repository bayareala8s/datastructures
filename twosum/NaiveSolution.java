package com.bayareala8s.twosum;

public class NaiveSolution {

    //the 1-dimensional array in which we store the integers
    private int[] nums;

    //the sum target
    private int sum;

    public NaiveSolution(int[] nums, int sum) {

        this.nums = nums;
        this.sum = sum;

    }

    //Because of the nested for loop it has O(N^2) quadratic running time complexity
    public void solve() {

        //we consider all the items in the array
        for(int i = 0; i < nums.length; ++i) {

            //for all items we check all other items
            for(int j = 0; j < nums.length; ++j) {

                //Check if 2 items sum up to sum or not
                if(nums[i] + nums[j] == sum) {
                    System.out.println("Solution: " + nums[i] + "+" + nums[j] + "=" + sum );
                }

            }
        }
    }
}

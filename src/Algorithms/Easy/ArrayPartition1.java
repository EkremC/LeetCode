package Algorithms.Easy;

import java.util.Arrays;

/**
 * Created by ekremcandemir on 3.10.2017.
 */
// https://leetcode.com/problems/array-partition-i/description/
public class ArrayPartition1 {

    public static void main(String[] args) {

    }

    public int arrayPairSum(int[] nums) {
        int sum = 0;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i += 2) {
            sum += nums[i];
        }

        return sum; 
    }
}

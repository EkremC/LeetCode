package Algorithms.Easy;

// https://leetcode.com/problems/missing-number/description/
public class _268_MissingNumber {

    public int missingNumber(int[] nums) {
        int sum = 0;
        for(int i : nums){
            sum += i;
        }

        int realSum = (nums.length * (nums.length + 1)) / 2;

        return realSum - sum;
    }
}

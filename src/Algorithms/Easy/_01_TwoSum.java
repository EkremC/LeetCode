package Algorithms.Easy;

/**
 * Created by ekremcandemir on 12/08/2017.
 */
// https://leetcode.com/problems/two-sum/descriptionc int[] twoSum(int[] nums, int target) {
public class _01_TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int first = 0;
        int second = 0;
        for(int i = 0; i < nums.length; i++){
            for(int j = i + 1; j < nums.length; j++){
                if(nums[i] + nums[j] == target){
                    first = i;
                    second = j;
                    break;
                }
            }
        }
        return new int[]{first, second};
    }
}
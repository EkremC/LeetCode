package Algorithms.Easy;

import java.util.HashSet;
import java.util.Set;

// https://leetcode.com/problems/contains-duplicate/description/
public class _217_ContainsDuplicate {

    public boolean containsDuplicate(int[] arr) {

        Set<Integer> set = new HashSet<>();

        for(int n : arr){
            if(!set.add(n))
                return true;
        }

        return false;
    }
}

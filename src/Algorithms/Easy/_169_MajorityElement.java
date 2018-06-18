package Algorithms.Easy;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

// https://leetcode.com/problems/majority-element/description/
public class _169_MajorityElement {

    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int i : nums){
            if(!map.containsKey(i)){
                map.put(i, 1);
            }else{
                map.put(i, map.get(i) + 1);
            }
        }
        int value = Collections.max(map.entrySet(), Map.Entry.comparingByValue()).getKey();

        return value;
    }

}

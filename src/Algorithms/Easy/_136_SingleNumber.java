package Algorithms.Easy;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class _136_SingleNumber {
    public int singleNumber(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if(map.containsKey(num)){
                map.put(num, map.get(num) + 1);
            }else{
                map.put(num, 1);
            }
        }

        Map.Entry<Integer, Integer> min = Collections.min(map.entrySet(), Comparator.comparing(Map.Entry::getValue));
        return min.getKey();
    }
}

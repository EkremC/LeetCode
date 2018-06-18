package Algorithms.Easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// https://leetcode.com/problems/intersection-of-two-arrays-ii/description/
public class _350_IntersectionOfTwoArrays2 {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map1 = arrToMap(nums1);
        Map<Integer, Integer> map2 = arrToMap(nums2);

        List<Integer> common = getCommonElements(map1, map2);

        return common.stream().mapToInt(i->i).toArray();
    }

    private Map<Integer, Integer> arrToMap(int[] arr){
        Map<Integer, Integer> map = new HashMap<>();
        for(int i : arr){
            if(map.containsKey(i)){
                map.put(i, map.get(i) + 1);
            }else{
                map.put(i, 1);
            }
        }
        return map;
    }

    private List<Integer> getCommonElements(Map<Integer, Integer> map1, Map<Integer, Integer> map2){
        List<Integer> list = new ArrayList<>();
        for(Map.Entry<Integer, Integer> entry1 : map1.entrySet()){
            for(Map.Entry<Integer, Integer> entry2: map2.entrySet()){
                if(entry1.getKey().equals(entry2.getKey())){
                    int min = Math.min(entry1.getValue(), entry2.getValue());
                    for(int i = 0; i < min; i++){
                        list.add(entry1.getKey());
                    }
                }
            }
        }
        return list;
    }
}

package Algorithms.Easy;

import java.util.HashMap;
import java.util.Map;

// https://leetcode.com/problems/jewels-and-stones/description/
public class _771_JewelsAndStones {

    public int numJewelsInStones(String J, String S) {

        int total = 0;
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < J.length(); i++) {
            char ch = J.charAt(i);
            if (!map.containsKey(ch)) {
                map.put(ch, 0);
            }
        }

        for (int i = 0; i < S.length(); i++) {
            char ch = S.charAt(i);
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            }
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            total += entry.getValue();
        }

        return total;
    }

}

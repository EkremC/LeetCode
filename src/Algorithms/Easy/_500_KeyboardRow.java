package Algorithms.Easy;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/keyboard-row/description/
public class _500_KeyboardRow {

    public String[] findWords(String[] words) {
        String firstLine = "qwertyuiop";
        String secondLine = "asdfghjkl";
        String thirdLine = "zxcvbnm";

        List<String> list = new ArrayList<>();

        for (String s : words) {
            if (contains(s, firstLine) || contains(s, secondLine) || contains(s, thirdLine)) {
                list.add(s);
            }
        }

        String[] retArr = new String[list.size()];
        list.toArray(retArr);

        return retArr;
    }

    private boolean contains(String s, String line) {
        s = s.toLowerCase();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (line.indexOf(ch) < 0)
                return false;
        }

        return true;
    }

}

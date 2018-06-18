package Algorithms.Easy;

// https://leetcode.com/problems/first-unique-character-in-a-string/description/
public class _387_FirstUniqueCharacterInAString {

    public int firstUniqChar(String s) {

        int index = -1;
        if(s.length() == 0){
            return index;
        }

        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(s.indexOf(ch) == s.lastIndexOf(ch)){
                index = i;
                break;
            }
        }

        return index;
    }
}

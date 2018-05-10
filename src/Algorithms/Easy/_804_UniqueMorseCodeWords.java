package Algorithms.Easy;

import java.util.HashSet;
import java.util.Set;

// https://leetcode.com/problems/unique-morse-code-words/description/
public class _804_UniqueMorseCodeWords {

    public int uniqueMorseRepresentations(String[] words) {
        String[] morseAlphabet = new String[]{".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};

        Set<String> transformations = new HashSet<>();

        for (String word : words) {
            StringBuilder sb = new StringBuilder();
            char[] chArr = word.toCharArray();
            for (char c : chArr) {
                sb.append(morseAlphabet[c - 'a']);
            }
            transformations.add(sb.toString());
        }

        return transformations.size();
    }

}

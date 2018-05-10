package Algorithms.Easy;

// https://leetcode.com/problems/reverse-words-in-a-string-iii/description/
public class _557_ReverseWordsInAString3 {

    public String reverseWords(String s) {
        String[] a = s.split(" ");
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < a.length; i++) {
            StringBuilder b = new StringBuilder(a[i]);
            sb.append(b.reverse()).append(" ");
        }

        return sb.toString().trim();
    }

}

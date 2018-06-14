package Algorithms.Easy;

// https://leetcode.com/problems/reverse-string/description/
public class _344_ReverseString {

    public String reverseString(String s) {
        return new StringBuilder(s).reverse().toString();
    }

}

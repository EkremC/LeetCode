package Algorithms.Easy;

// https://leetcode.com/problems/number-of-lines-to-write-string/description/
public class _806_NumberOfLinesToWriteString {

    public int[] numberOfLines(int[] widths, String S) {
        int count = 0;
        int line = 1;
        char[] arr = S.toCharArray();
        for (char c : arr) {
            int letterSize = widths[c - 'a'];
            if ((count + letterSize) > 100) {
                line++;
                count = letterSize;
            } else {
                count += letterSize;
            }
        }

        return new int[]{line, count};

    }

}

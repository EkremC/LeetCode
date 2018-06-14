package Algorithms.Easy;

// https://leetcode.com/problems/flipping-an-image/description/
public class _832_FlippingAnImage {

    public int[][] flipAndInvertImage(int[][] A) {
        reverseRows(A);

        invertImage(A);

        return A;
    }

    private void invertImage(int[][] A) {
        for (int i = 0; i < A.length; i++) {
            for(int j = 0; j < A[i].length; j++){
                A[i][j] ^= 1;
            }
        }
    }

    private void reverseRows(int[][] A) {
        for(int i = 0; i < A.length; i++){
            for (int j = 0; j < A[i].length / 2; j++) {
                int temp = A[i][j];
                A[i][j] = A[i][A[i].length - (j + 1)];
                A[i][A[i].length - (j + 1)] = temp;
            }
        }
    }

}

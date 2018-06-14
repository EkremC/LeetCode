package Algorithms.Easy;

// https://leetcode.com/problems/shortest-distance-to-a-character/description/
public class _821_ShortestDistanceToACharacter {

    public int[] shortestToChar(String S, char C) {
        char[] arr = S.toCharArray();
        int[] ret = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            if(C == arr[i]){
                ret[i] = 0;
            }else{
                int shortestLeft = S.lastIndexOf(C, i);
                int shortestRight = S.indexOf(C, i);
                if(shortestLeft != -1 && shortestRight == -1){
                    ret[i] = i - shortestLeft;
                }else if(shortestRight != -1 && shortestLeft == -1){
                    ret[i] = shortestRight - i;
                }else{
                    ret[i] = Math.min(i - shortestLeft, shortestRight - i);
                }
            }
        }

        return ret;
    }

}

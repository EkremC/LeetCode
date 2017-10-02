package Algorithms.Easy;

/**
 * Created by ekremcandemir on 3.10.2017.
 */
// https://leetcode.com/problems/judge-route-circle/description/
public class JudgeRouteCircle {

    public static void main(String[] args) {
        JudgeRouteCircle jg = new JudgeRouteCircle();
        System.out.println(jg.judgeCircle("LL"));
    }

    public boolean judgeCircle(String moves) {
        int x = 0;
        int y = 0;

        for (int i = 0; i < moves.length(); i++) {
            switch (moves.substring(i, i + 1)){
                case "R":
                    x++;
                    break;
                case "L":
                    x--;
                    break;
                case "U":
                    y++;
                    break;
                case "D":
                    y--;
                    break;
            }
        }

        return (x == 0 && y == 0) ? true : false;
    }
}

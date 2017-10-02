package Algorithms.Easy;

/**
 * Created by ekremcandemir on 3.10.2017.
 */
// https://leetcode.com/problems/hamming-distance/description/
public class HammingDistance {

    public static void main(String[] args){
        HammingDistance hm = new HammingDistance();
        System.out.println(hm.hammingDistance(1, 4));
        int ret = 1 ^ 4;
        System.out.println("ret: " + ret);
        System.out.println(Integer.bitCount(ret));
    }

    public int hammingDistance(int x, int y) {
        int distance = 0;
        String xStr = new StringBuilder(Integer.toBinaryString(x)).reverse().toString();
        String yStr = new StringBuilder(Integer.toBinaryString(y)).reverse().toString();
        if(xStr.length() > yStr.length()){
            for (int i = 0; i < yStr.length(); i++) {
                if(!xStr.substring(i, i + 1).equals(yStr.substring(i, i + 1)))
                    distance++;
            }
            for (int i = yStr.length(); i < xStr.length(); i++) {
                if(xStr.substring(i, i + 1).equals("1"))
                    distance++;
            }
        }else if(xStr.length() < yStr.length()){
            for (int i = 0; i < xStr.length(); i++) {
                if(!yStr.substring(i, i + 1).equals(xStr.substring(i, i + 1)))
                    distance++;
            }
            for (int i = xStr.length(); i < yStr.length(); i++) {
                if(yStr.substring(i, i + 1).equals("1"))
                    distance++;
            }
        }else{
            for (int i = 0; i < xStr.length(); i++) {
                if(!yStr.substring(i, i + 1).equals(xStr.substring(i, i + 1)))
                    distance++;
            }
        }
        return distance;
    }
}

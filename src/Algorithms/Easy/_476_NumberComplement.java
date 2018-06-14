package Algorithms.Easy;

// https://leetcode.com/problems/number-complement/description/
public class _476_NumberComplement {

    public int findComplement(int num) {
    	String binary = Integer.toBinaryString(num);
    	String binaryComplement = complement(binary);

    	return Integer.parseInt(binaryComplement, 2);

    }

    private String complement(String binary){
    	StringBuilder sb = new StringBuilder();
    	for(int i = 0; i < binary.length(); i++){
    		char ch = binary.charAt(i);
    		if(ch == '1') sb.append("0");
    		else sb.append("1");
    	}

    	return sb.toString();
    }

}

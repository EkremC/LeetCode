package Algorithms.Easy;

import java.util.List;
import java.util.ArrayList;
// https://leetcode.com/problems/fizz-buzz/description/

public class _412_FizzBuzz{

	public List<String> fizzBuzz(int n){
		List<String> list = new ArrayList<>();
		for (int i = 1; i <= n ; i++) {
			if(i % 15 == 0){
				list.add("FizzBuzz");
			}
			else if(i % 3 == 0){
				list.add("Fizz");
			}else if(i % 5 == 0){
				list.add("Buzz");
			}else{
				list.add(String.valueOf(i));
			}
		}

		return list;
	}

	public static void main(String[] args) {
		System.out.println("asdfasdf");
	}
}
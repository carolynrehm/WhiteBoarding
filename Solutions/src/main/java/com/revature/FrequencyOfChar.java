package com.revature;

public class FrequencyOfChar {
	
	public static int returnCount(char[] arr, char ch) {
		int count = 0;
		for(char c : arr) {
			if(c==ch) {
				count++;
			}
		}		
		return count;
	}

	public static void main(String[] args) {
		char[] charArr = {'s','a','s','l'};
		System.out.println(returnCount(charArr, 's'));
		System.out.println(returnCount(charArr, 'a'));

	}

}

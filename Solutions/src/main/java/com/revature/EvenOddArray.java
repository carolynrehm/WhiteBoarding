package com.revature;

public class EvenOddArray {

	public static void printEvensAndOdds(int[] input) {
		int numOdd = 0;
		int numEven = 0;
		if(input != null && input.length != 0) {
			for(int a : input) {
				if (a%2==0) {
					numEven++;
				} else {
					numOdd++;
				}
			}
		} 
		System.out.println("even = "+numEven+", odd = "+numOdd);
		
	}
	
	public static void main(String[] args) {
		int[] arr = {2,4,3,2,1,1,1};
		printEvensAndOdds(arr);
	}

}

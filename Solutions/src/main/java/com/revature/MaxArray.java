package com.revature;

import java.util.Arrays;

public class MaxArray {

	public static int[] returnMaxs(int[] input) {
		if(input == null){
			return null;
		} 
		if (input.length == 0 || input.length ==1){
			return input;
		}
		int count = 1;
		int max = input[0];
		for(int i = 1; i<input.length; i++){
			if(input[i]>max){
				max = input[i];
				count = 1;
			} else if (input[i]==max){
				count++;
			}
		}
		int[] output = new int[count];
		Arrays.fill(output,max);
		return output;
	}

	public static void main(String[] args) {
		int[] arr1 = {1,3,5,3,2,4,5,5};
		int[] arr2 = returnMaxs(arr1);
		for(int i :arr2) {
			System.out.print(i+" ");
		}

	}

}

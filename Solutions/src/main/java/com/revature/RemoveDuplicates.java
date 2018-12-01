package com.revature;

public class RemoveDuplicates {

	/*
	 * 
	 * Remove duplicates from an integer array without using core java only 
	 * (no collections or utility classes)
	 * 
	 */

	public static int[] removeDuplicates(int[] original) {

		if(original.length == 0 || original.length == 1){
			return original;
		}

		int[] record = new int[original.length];
		int uniqueCount = original.length;

		for(int i=0; i<original.length; i++){
			for(int j=i+1; j<original.length; j++){
				if(original[i]==original[j]){
					record[j]=1;
					uniqueCount--;
				}
			}
		}



		int[] finalArr = new int[uniqueCount];
		int recordPos = 1;
		finalArr[0]=original[0];
		for(int finalPos=1; finalPos<finalArr.length; finalPos++){
			while(record[recordPos]==1){
				recordPos++;
			}
			finalArr[finalPos]=original[recordPos];
			recordPos++;
		}
		return finalArr;
	}

	public static void main(String[] args) {
		int[] arr1 = {2,4,2,1,4,6,3,};
		int[] arr2 = removeDuplicates(arr1);
		for(int i :arr2) {
			System.out.print(i);
		}
	}

}

package com.revature;

import java.util.Arrays;

public class CombineArrays {
	
	
	public static <T,U> Object[] combine(T[] arr1, U[] arr2) {
		int combinedLength = arr1.length+arr2.length;
		Object[] returnArr = new Object[combinedLength];
		int count = 0;
		for(T item: arr1) {
			returnArr[count] = item;
			if(count+1<combinedLength) {
				count++;				
			}
		}
		for(U item: arr2) {
			returnArr[count] = item;
			if(count+1<combinedLength) {
				count++;				
			}
		}
		return returnArr;
	}

	public static void main(String[] args) {
		Integer[] intArr = {3,2,5,2,1};
		Character[] charArr = {'a','y','w','m'};
		Object[] combinedArr = combine(intArr, charArr);
		System.out.println(Arrays.toString(combinedArr));

	}

}

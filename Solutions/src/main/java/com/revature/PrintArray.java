package com.revature;

public class PrintArray {

	public static String toString(int[] arr) {
		String result = "";
		if(arr == null) {
			return result;
		}
		if(arr.length == 0) {
				return result;
			}
		result+="[";
		for(int i = 0; i<arr.length;i++) {
			if(i>0) {
				result+=",";
			}
			result+=arr[i];
		}
		return result+"]";
	}
	
	public static <T> String toString(T[] arr) {
		String result = "";
		if(arr == null) {
			return result;
		}
		if(arr.length == 0) {
				return result;
			}
		result+="[ ";
		for(int i = 0; i<arr.length;i++) {
			if(i>0) {
				result+=", ";
			}
			result+=arr[i];
		}
		return result+" ]";
	}
	
	public static void main(String[] args) {
		Integer[] arr1 = {1,3,5,3,2,4,5,5};
		String[] arr2 = {"hello","world","cat","dog","blue","yellow"};
		System.out.println(toString(arr1));
		System.out.println(toString(arr2));

	}

}

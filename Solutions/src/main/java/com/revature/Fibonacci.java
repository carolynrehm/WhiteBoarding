package com.revature;

import java.util.Arrays;

public class Fibonacci {

	public static int fib(int n) {
		if(n == 1 || n == 0) {
			return 1;
		} else {
			return fib(n-1)+fib(n-2);
		}
	}
	
	public static int[] fibArr(int n) {
		int[] arr  = new int[n];
		if(n == 0) {
			return arr;
		}
	
			for(int i = 0; i<n; i++) {
				if(i == 0 || i == 1) {
					arr[i] = 1;
				} else {
					arr[i] = arr[i-1]+arr[i-2];					
				}
			}
	
		return arr;
	}
	
	
	public static void main(String[] args) {
//		System.out.println(fib(0));
//		System.out.println(fib(1));
//		System.out.println(fib(2));
//		System.out.println(fib(3));
		
		System.out.println(Arrays.toString(fibArr(0)));
		System.out.println(Arrays.toString(fibArr(1)));
		System.out.println(Arrays.toString(fibArr(2)));
		System.out.println(Arrays.toString(fibArr(3)));
		System.out.println(Arrays.toString(fibArr(8)));
		
	}

}

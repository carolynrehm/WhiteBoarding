package com.revature;

public class ReverseString {

	/*
	 * write a method which reverses a String
	 * 
	 * challenge: implement the method using no other method than String's charAt() 
	 * (no length, no other object's methods)
	 * 
	 */
	
	public static String reverse(String input){
	    StringBuilder output = new StringBuilder(input.length());
	    for(int i = 0; i<input.length();i++){
	        output.insert(0, input.charAt(i));
	    }
	    return output.toString();
	}
	
	public static String reverse2(String input){
	    int length = 0;
	    String output = "";
	    try{
	        for(int i = 0; ; i++){
	            input.charAt(i);
	            ++length;
	            System.out.println(i);
	        }

	    } catch (StringIndexOutOfBoundsException e){
	    	for(int i = length; i>0; i--){
	        	output += input.charAt(i-1);
	        }
	    }
	    return output;
	}
	
	public static void main(String[] args) {
		System.out.println(reverse("reverse"));
	}
	

}

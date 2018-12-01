package com.revature;

public class FirstCaps {

	/*
	 *  given a String, write a method which returns the same String but with each word capitalized
	 * 
	 */
	
	
	public static String transformToCap(String input) {
		String[] strArr = input.split(" ");
        String[] strArr2 = new String[strArr.length];
        for(int i=0; i<strArr.length; i++){
            String currentWord = strArr[i];
            currentWord = currentWord.substring(0,1).toUpperCase()+currentWord.substring(1);
            strArr2[i] = currentWord;
        }
		return String.join(" ", strArr2);
	}
	
	public static void main(String[] args) {

		System.out.println(transformToCap("hello world"));
		
	}

}

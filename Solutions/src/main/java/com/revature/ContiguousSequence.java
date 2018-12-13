package com.revature;

public class ContiguousSequence {
	
	public static char maxLetter(String input) {
		int currentCount=0;
		int maxCount=0;
		char maxChar= '\u0000';
		
		// defensive coding, check for null values and an empty string
		if(input==null||input.equals("")) {
			return maxChar;
		} 
		
		// return the only character in the string if there is only one
		maxChar = input.charAt(0);
		if (input.length()==1) {
			return maxChar;
		}
		
		// iterate through the string, incrementing max count and recording 
		// when current count exceeds max count
		for(int i=1;i<input.length();i++) {
			if(input.charAt(i)==input.charAt(i-1)) {
				currentCount++;
				if(currentCount>maxCount) {
					maxCount=currentCount;
					maxChar = input.charAt(i);
				}
			} else {
				// reset current count to 1 if we move onto a new character in the sequence
				currentCount = 1;
			}
		}
		return maxChar;
	}

	public static void main(String[] args) {
		System.out.println(maxLetter("aaffbbbbddksaaa"));
		
	}

}

package com.revature;

import java.util.HashMap;

public class Anagram {
	
	/*
	 * Given a word 
	 * 
	 *  (a word formed by rearranging the letters of a different word)
	 *  
	 *  (parsley, players) -> true
	 *  (silent, listen) -> true 
	 *  (cat, dog) -> false
	 *  (poll, loop) -> false
	 *  
	 */
	
	
		public static boolean isAnagram(String first, String second){
			if(first == second) {
				return true;
			}
			if(first == null | second == null) {
				return false;
			}
		    HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		    char[] charArray1 = first.toCharArray();
		    for(char c : charArray1){
		        if(map.get(c)==null){
		            map.put(c, 1);
		        } else {
		            map.replace(c, map.get(c)+1);
		        }
		    }
		    char[] charArray2 = second.toCharArray();
		    for(char c : charArray2){
		        if(map.get(c)==null){
		            return false;
		        } else if (map.get(c)==1) {
		            map.remove(c);
		        } else {
		            map.replace(c, map.get(c)-1);
		        }
		    }
		    if(map.entrySet().size() == 0){
		        return true;
		    } 
		    return false;
		}
	

	public static void main(String[] args) {
		//true test cases
		System.out.println(isAnagram("parsley", "players"));
		System.out.println(isAnagram("silent", "listen"));
		System.out.println(isAnagram("", ""));

		//false test cases
		System.out.println(isAnagram("cat", "dog"));
		System.out.println(isAnagram("poll", "loop"));
		System.out.println(isAnagram("", "loop"));
	}

}

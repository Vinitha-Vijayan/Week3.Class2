package week3.day2;

import java.util.HashSet;
import java.util.Set;

public class PrintOnlyUniqueCharacters {
	
	//String input = "babu";

	//output:// a u
	/*
	  * Psuedocode
	  * 
	  * 1) Convert String to Character array
	  * 2) Create a new Set -> HashSet
	  * 3) Add each character to the Set and if it is already there, remove it
	  * 4) Finally, print the set
	  * 
	  */

	public static void main(String[] args) {
		// input 
		String input = "babu";
		//Convert to char array
		
		char[] chareArray = input.toCharArray();
		
		//create set object using hashset 
		
		Set <Character> ch = new HashSet<Character>();
		
		//iteration to check duplicates
		
		for( int i =0 ; i <chareArray.length; i++) {
			if(!ch.add(chareArray[i])) {
				ch.remove(chareArray[i]);
			}
		}
		System.out.println(ch);
	}

}

package week3.day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class MissingNumber {
	
	//missing Number
	//int[] numbers = {4,6,7,2,3,1,9,10,8,8,6,2};

	/*
	  * Psuedocode
	  * 
	  * 1) Remove the duplicates using Set
	  * 2) Make sure the set is in the ascending order
	  * 3) Iterate from the starting number and verify the next number is + 1
	  * 4) If did not match, that is the number
	  * 
	  */

	public static void main(String[] args) {
		
		// input 
		int[] numbers = {4,6,7,2,3,1,9,10,8,8,6,2};
		// Get the input in arraylist
		
		Set<Integer> data = new TreeSet<Integer>();
		
		for(int i =0 ; i<numbers.length; i++) {
			
			data.add(numbers[i]);
			//System.out.println(data);
		}
		//count inializing
		int count =1;
		//check the count value in set array 
		
		for (int i=0; i<data.size(); i++) {
			if(data.contains(count)) {
				//if yes inc count
				count=count+1;
			}else {
				//print the missing number 
				
				System.out.println("The missin number is " +count);
				count=count+1;
			}
		}
		

	}

}

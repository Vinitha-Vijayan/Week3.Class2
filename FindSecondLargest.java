package week3.day2;

import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class FindSecondLargest {
	// Here is the input
			//int[] data = {3,2,11,4,6,7};

			
			/*
			 Pseudo Code:
			 1) Arrange the array in ascending order
			 2) Pick the 2nd element from the last and print it
			 */
		

	public static void main(String[] args) {
		
		//Step 1:Intializin arraylist 
		
		ArrayList <Integer> arr= new ArrayList <Integer>();
		
		// Step 2 :Input array
	int data[] = {3,2,11,4,6,7};
	
		// STep 3 :loop 
		for (int i = 0 ;i < data.length; i++) {
			
			arr.add(i, data[i]);					
		}
		
		// Step 4 :sort the order using collection
		
		Collections.sort(arr);
		System.out.println(arr);
		
		Collections.reverse(arr);
		System.out.println(arr);
		// Print second largest number
		System.out.println(arr.get(1));
	

	}

}

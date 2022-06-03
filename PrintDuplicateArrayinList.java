package week3.day2;

import java.util.ArrayList;

public class PrintDuplicateArrayinList {
	
	//int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
	
	// get the length of the array
	// declare an int variable named count
	
	// iterate from 0 to the array length-1 (outer loop starts here)
	
		// assign 0 to count 
		
		// iterate from i to the length of the array by adding 1 to it (inner loop starts here)
		
				// compare both the loop variables & check they're equal
			
						// increase the count if both the arrays are equal
				
		// Out of the inner loop, check and print the first array variable if count is more t

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//input data
		int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		
		//get the data in list	
		ArrayList<Integer> data =new ArrayList<Integer>();
		
		//add elements to list array
		
		for (int i =0; i <arr.length ; i++) {
			data.add(i, arr[i]);
		}
// initialize count 
		
		int count;
		
		//to check duplicate iterate the list 
		
		for (int i=0;i < data.size()-1;i++) {
			count =0;
			
			for (int j = i+1; j<data.size();j++) {
				if (data.get(i)==data.get(j)) {
					count++;
				}
			}
			if (count>0) {
				System.out.println("Duplicate in the list is " +data.get(i));
			}
		}
		

	}

}

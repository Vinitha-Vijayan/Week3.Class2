package week3.day2;

import java.util.ArrayList;
import java.util.Collections;

public class MissingElementInArray {
	// Here is the input
	//int[] arr = {1,2,3,4,7,6,8};

	// Sort the array	
	

	// loop through the array (start i from arr[0] till the length of the array)

		// check if the iterator variable is not equal to the array values respectively
		
			// print the number
			
			// once printed break the iteration
	

	public static void main(String[] args) {
		
		//Get the list of array
		
		ArrayList<Integer> element = new ArrayList <Integer>();
		
		//Declare input 
		
		int arr[] = {1,2,3,4,7,6,8};
		
		//loop 
		for(int i =0 ;i < arr.length; i++)
		{
			element.add(i, arr[i]);
		}
		
		//sort the array in order
		
		Collections.sort(element);
		
		System.out.println(element);
		//loop through the array (start i from arr[0] till the length of the array)
		//count value 
		int count= 1;
		for (int i =0 ; i <arr.length; i++) {
			// check the value of arraylist and count are not equal
			
			if(element.get(i)!=count) {
				System.out.println(" The missing number from the array is " + count);
			}
			count=element.get(i)+1;
		}

	}

}

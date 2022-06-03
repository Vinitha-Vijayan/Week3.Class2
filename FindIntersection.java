package week3.day2;


import java.util.ArrayList;
import java.util.List;

public class FindIntersection {
	

	/*
	 * Pseudo Code
	
	 * a) Declare An array for {3,2,11,4,6,7};	 
	 * b) Declare another array for {1,2,8,4,9,7};
	 * c) Declare for loop iterator from 0 to array length
	 * d) Declare a nested for another array from 0 to array length
	 * e) Compare Both the arrays using a condition statement
	 
	 *  f) Print the first array (should match item in both arrays)
	 */
	public static void main(String[] args) {
	// Create arraylist to store the intersection value 
		List<Integer> array =new ArrayList <Integer>();
		//step1:Declare An array for {3,2,11,4,6,7};
		
		int intarray1[]= {3,2,11,4,6,7};
		
		//Step2 :Declare another array for {1,2,8,4,9,7};
		int intarray2[]= {1,2,8,4,9,7};
		
		//ste3: Declare for loop iterator from 0 to array length
		for( int i =0 ; i< intarray1.length ; i++) {
			
			for (int j =0 ; j< intarray1.length ; j++){
				
				if(intarray1[i] == intarray2[j])
					array.add(intarray1[i]);		
				
			}
			
		}
		
		System.out.println(array);
	}

}

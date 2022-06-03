package week3.day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDublicates {
	/*
	 * Pseudo code 
	 
	 * a) Use the declared String text as input
		String text = "We learn java basics as part of java sessions in java week1";		
	 * b) Initialize an integer variable as count	  
	 * c) Split the String into array and iterate over it 
	 * d) Initialize another loop to check whether the word is there in the array
	 * e) if it is available then increase and count by 1. 
	 * f) if the count > 1 then replace the word as "" 
	 
	 * g) Displaying the String without duplicate words	
	*/
	public static void main(String[] args)
	{
		
	//Step1:Use the declared String text as input
	
	String text = "We learn java basics as part of java sessions in java week1";
	
	//create a set object to check the text is in same order using liknedhahset
	
	Set<String> array = new LinkedHashSet<String>();
	
	//Step2 :Initialize an integer variable as count	
	
	int count =0;
	
	//Step 3:Split the String into array and iterate over it 
	String[] arrayString =text.split("");
	
	for (int i=0; i< arrayString.length; i++) {
		array.add(arrayString[i]);
		
		System.out.println(array);
	}
	

	}

}

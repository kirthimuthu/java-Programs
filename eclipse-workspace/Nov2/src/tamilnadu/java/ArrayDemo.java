package tamilnadu.java;

import java.util.Scanner;

public class ArrayDemo {
	public static void main (String[] args) {
		ArrayDemo ad = new ArrayDemo();
		int[] ar = {10,-20,-30,-40,50,60}; 
		//ar = ad.shift_left_once(ar); 
		//for(int i=0; i<ar.length;i++)
		{
			//System.out.print(ar[i]+" ");
		} 
		//int[] ar = {10,120,320, 50};
		//ad.printArray(ar);
		//ad.printReverseOrder(ar);
		 //ad.LinearSearch();
		//ad.get_Biggest_And_Second_Biggest();
		//ad.print_only_adjacent_values();
		//ad.get_Smallest_And_Second_Smallest();
		//ad.shift_left_once(ar);
		int[] arr = {10,-20,-30,-40,50,60}; 
		int negative_count = ad.count_negative_numbers(arr); 
		int[] ar2 = new int[negative_count]; 
		ad.addition_of_arrays();
	}
	private void addition_of_arrays() {
		// TODO Auto-generated method stub
		
	}
	private int count_negative_numbers(int[] ar) {
	
			  int count = 0;  
				for(int i=0; i<ar.length; i++)
				{
					if(ar[i]<0)
			        {
				    count++;
			        } 
				}
	return count; 	
		
	}
	private int[] shift_left_once(int[] ar) {
		// TODO Auto-generated method stub
		System.out.println();
		System.out.print("Before Shifting: ");
		for(int i=0; i<ar.length;i++)
		{
			System.out.print(ar[i]+" ");
		}
		System.out.println();
		System.out.print("After Shifting: ");;
		int i=0; 
		int temp = ar[0]; 
		while(i<ar.length-1)
		{
		ar[i] = ar[i+1]; 
		i++; 
		}
		ar[i] = temp; 
		return ar; 
	} 
	private void get_Smallest_And_Second_Smallest() {
		// TODO Auto-generated method stub
		int[] ar = {15,-12,14,18}; 
		int small = Integer.MAX_VALUE, small2 = Integer.MAX_VALUE; 
		for(int i=0; i<ar.length; i++)
		{
		if(ar[i]<small)		
		{
			small2 = small; 
			small = ar[i]; 	
		}
		else if(ar[i]<small2){
			small2 = ar[i]; 
			}
		}
System.out.println("Smallest value is "+ small +
		" Second Smallest value is "+ small2);
		
	}
	private void print_only_adjacent_values() {
			// TODO Auto-generated method stub
			int[] ar = {3, 8, 15, 7}; 
			//			0  1   2  3
						//3<8
			for(int j = 0; j<ar.length-1; j++)
			{
			int small = ar[j]<ar[j+1]?ar[j]: ar[j+1];
			int big = ar[j]>ar[j+1]? ar[j]: ar[j+1]; 
			for(int i= small+1; i<=big; i++)
			System.out.print(i+" "); 
			System.out.println();
			}
			} 
	private void LinearSearch(int[] values, int key) {
		// TODO Auto-generated method stub
	
			for(int i=0; i<values.length;i++)
			{
			 if(values[i]==key)
			 {
			  System.out.println("Yes Present at index: "+ i);
			  break; 
			 }
	}
	
		 }
	private void printReverseOrder(int[] values) {
		// TODO Auto-generated method stub
		int total = 0; 
		 // Printing in Reverse Order
	         for(int i=values.length-1;i>=0; i-- )
	         { System.out.println(values[i]); }

	}
	private void printArray(int[] values) {
		// TODO Auto-generated method stub
		
	  int total = 0; 
		 // Printing in Reverse Order
	        
		  for(int i=0; i<values.length;i++)
		  {
		   total = total + values[i]; 
		  }
		  System.out.println(total);
		  System.out.println(total/values.length);
		  }
        
	private void get_Biggest_And_Second_Biggest() {
		int[] ar = {-15,-12,-14,-18}; 
		int big = Integer.MIN_VALUE, big2 = Integer.MIN_VALUE; 
		for(int i=0; i<ar.length; i++)
		{
		if(ar[i]>big)		{
			big2 = big; 
			big = ar[i]; 	}
		else if(ar[i]>big2){
			big2 = ar[i]; 
			}
		}
System.out.println("Biggest value is "+ big + " Second biggest value is "+ big2);
	} 
         
}


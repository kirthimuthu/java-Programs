package tamilnadu.java;

import java.util.Scanner;

public class Multi_Dimensional_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] marks = new int[8][]; 
		System.out.println(marks.length);
		//System.out.println(marks[0].length);
		
		// Jagged Array:
				marks[0] = new int[6]; 
				marks[1] = new int[8]; 
				marks[2] = new int[5]; 
		
		Multi_Dimensional_Array mda = new Multi_Dimensional_Array(); 
		mda.calculate_total();
		

		
		

		

	}

	private void calculate_total() {
		// TODO Auto-generated method stub
		int[][] marks = new int[3][5]; 
		System.out.println("Length " + marks.length);
		System.out.println(marks[2].length);
		Scanner sc = new Scanner(System.in); 
		for(int row=0; row<marks.length; row++)
		{
			int examTotal = 0; 
		for(int col=0; col<marks[row].length; col++)
		{
			System.out.println("Enter Marks"); 
			
		marks[row][col] = sc.nextInt(); 
		examTotal = examTotal + marks[row][col];
		}
		System.out.println("Exam Total is "+ examTotal);
		}
		
	}
	

	}



package number.java;

public class PatternTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     PatternTest pt1 = new PatternTest();
     //pt1.pattern1();
       //pt1.pattern2();
     pt1.pattern3();
     
	}

	   private void pattern3() {
		// TODO Auto-generated method stub
		   int n = 5;

		    //Loop to iterate over each row
		    for (int i = 1; i <= n; i++) {
		      //Loop to iterate over each column
		      int counter = i;
		      for (int j = 1; j <= i; j++) {
		        System.out.print(counter + " ");
		        counter = counter + n - j;
		      }
		      System.out.println();
		    }
		  }
	

	private void pattern2() {
		// TODO Auto-generated method stub
		   System.out.println("How many rows you want in this pattern?");
		   int rows = 5;
		  
		   System.out.println("Here is your pattern....!!!");
		  
		   int num = 1;
		   for (int i = 1; i <= rows; i++)
		   {
		   for (int j = 1; j <= i; j++)
		   {
		   System.out.print(num+" ");
		   num++;
		   }
           System.out.println();  
		   }
}
	private void pattern1() {
		// TODO Auto-generated method stub
	System.out.println("Enter the number of rows: ");    
		int rows = 5;      
	for (int i = 1; i <= rows; i++) 
{
		for (int j = 1; j <= i; j++)
		{
		System.out.print(i+" ");
}

		System.out.println();}         
	}

}

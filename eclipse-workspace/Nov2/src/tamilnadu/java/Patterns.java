package tamilnadu.java;

public class Patterns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Patterns p1 = new Patterns();
		//p1.print12345();
		//p1.Patterns2();
		//p1.Patterns3();
		//p1.Patterns4();
		//p1.Patterns5();
		//p1.Patterns6();
		//p1.Patterns7();
		//p1.Patterns8();
		//p1.Patterns8_b();
		//p1.Patterns9();
		//p1.Patterns10();
		//p1.printC();
		//p1.printI();	
		p1.printT();
		}
	
		private void printT() {
		// TODO Auto-generated method stub
			for(int col=1; col<=7; col++)
			{
				System.out.print("* ");
			}
			System.out.println();
			for(int row=1; row<=9; row++)
			{
			for(int i=1; i<=3; i++)
			{ System.out.print("  "); }
			System.out.println("*"); 
			}
	}

		private void printI() {
		// TODO Auto-generated method stub
			for(int star=1; star<=7; star++)
			{ 
				System.out.print("* ");  	
			}
			System.out.println(); 
			for(int star=1; star<=7; star++)
			{ 
				if(star==4)
					System.out.println("* "); 	
				else if(star==1 || star==2 || star==3)
					System.out.print("  "); 
			}
			for(int star=1; star<=7; star++)
			{ 
			System.out.print("* "); 
			}
	}

		private void printC() {
		// TODO Auto-generated method stub
			for(int star=1; star<=7; star++)
			{ if(star==1)
				System.out.print("  "); 
			else
				System.out.print("* ");  	
			}
			System.out.println(); 
			for(int star=1; star<=7; star++)
			{ System.out.println("* "); 	}
			for(int star=1; star<=7; star++)
			{ if(star==1)
				System.out.print("  "); 
			else
			System.out.print("* "); 
			}
	}

		private void Patterns10() {
		// TODO Auto-generated method stub
			for(int row=1; row<=5; row++)
			{
			for(int num= 1; num<= row-1; num++)
			{
			System.out.print(" " + " "); 
			}
			for(int num=1; num<=6-row; num++)
			{
			System.out.print("*" + "   "); 
			}
			System.out.println(); 
			}
	}

		private void Patterns9() {
		// TODO Auto-generated method stub
			for(int row=1; row<=5; row++)
			{
			for(int num= 1; num<= row-1; num++)
			{
			System.out.print(num + " "); 
			}
			System.out.println(); 
			}
	}

		private void Patterns8_b() {
		// TODO Auto-generated method stub
			for(int row=5; row>=1; row--)
			{
			for(int num= row; num<=5; num++)
			{
			System.out.print(num+" "); 
			}
			System.out.println(); 
			}
			
	}

		private void Patterns8() {
		// TODO Auto-generated method stub
			for(int row = 5; row>=1; row--)
			{
			for(int col=row; col<=5; col++)
			{ System.out.print(col + " ");  }
			System.out.println();  
			}
			
	}

		private void Patterns7() {
		// TODO Auto-generated method stub
		for(int row=1; row<=5; row++ )
		{
		for(int num=5; num>=6-row; num--)
		{
			System.out.println(num + " ");
		}
		System.out.println();
		}
	}

		private void Patterns6() {
		// TODO Auto-generated method stub
			for(int row=1; row<=5; row++)
			{
			for(int num= 1; num<= row; num++)
			{
				System.out.print(num + " "); 
			}

			System.out.println(); 
			}
			
	}

		private void Patterns5() {
		// TODO Auto-generated method stub
		int row=5;
		while(row>=1) {
		for(int col=row; col>=1; col--)
		{System.out.println(col+" ");
		}
		System.out.println(); row--;
		}
	}

		private void Patterns3() {
		// TODO Auto-generated method stub
			for(int row=1; row<=5; row++)
			{
			for(int num= row; num<= 5; num++)
			{
			System.out.print(num + " "); 
			}
			System.out.println(); 
			} 
	}

		private void Patterns4() {
			
		// TODO Auto-generated method stub
			for(int row=1; row<=5; row++)
			{

				for(int col= 1; col<=5-row; col++)
					{
					System.out.print(" "+" "); 
					}
				for(int col=1; col<=row;col++)
					System.out.print(col+ " "); 
			System.out.println(); 
			} 
		
	}

		private void Patterns2() {
		// TODO Auto-generated method stub
			for(int row=1; row<=5; row++)
			{
			for(int num=1; num<=6-row; num++)
			{	
				System.out.print(row + " "); 
			}
			System.out.println();
			} 
		
	}
		private void print12345() {
			for(int row=1; row<=5; row++)
			{
			for(int num=1; num<=6-row; num++)
			{	
				System.out.print(num + " "); 
			}
			System.out.println();
			} 
		}
}
		
	
		
		
	

			

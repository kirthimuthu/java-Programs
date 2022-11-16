package tamilnadu.java;

import javax.management.loading.PrivateClassLoader;

public class LoopingPrograms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  LoopingPrograms lp = new LoopingPrograms(); 
		 // lp.sum_of_first_n_numbers();
		 // lp.armstrong(); 
		  //lp.StrongNumber();
		  //lp.multiples_of_3_and_5();
		    //lp.multiples_of_3_or_5();
		  //lp.count_of_digits(567419);
		  //lp.sum_of_digits(int box);
		 // lp.find_count_of_divisors(100);
		  //lp.find_divisors(100);
		  //lp.prime_or_not(14);
		  //lp.print_no_in_reverse_order(145);
		 // lp.find_factorial(5);
		  //lp.find_palindrome(12321);
		  //lp.reverse_no(9898);
		   //lp.find_binary(32);
	}
	private void find_binary(int decimal ) {
		// TODO Auto-generated method stub
		
		String binary = ""; 
		while(decimal>0)
		{
		int rem = decimal%2; //6%2 3%2  1%2
		binary = rem + binary; //0 + "" => 1+ "0" => "10" => 1+"10" -> 110
		decimal = decimal / 2;// decimal = 1
		}
		System.out.println("Binary is " + binary); 
		
	} 
		   private  void armstrong() {
		

		        int num = 370, number, temp, total = 0;

		        number = num;
		        while (number != 0)
		        {
		            temp = number % 10;
		            total = total + temp*temp*temp;
		            number /= 10;
		        }

		        if(total == num)
		            System.out.println(num + " is an Armstrong number");
		        else
		            System.out.println(num + " is not an Armstrong number");
	}
		   
		   private void  StrongNumber() {
			   int n=145;
			    int n1=n;
			    int rem=n%10;
			    int arm=1;
			    for(int i=1;i<=rem;i++) {
			      arm*=i;
			       
			    }
			    //System.out.println(arm);
			        n=n/10;
			    //System.out.println(n);
			    while(n>0) {
			      int m=n%10;
			      int x=1;
			      for(int i=1;i<=m;i++) {
			        x*=i;
			         
			      }
			      int l=n/10;
			      int z=1;
			      for(int i=1;i<=l;i++) {
			        z*=i;
			      }
			      int u=arm+x+z;
			      //System.out.println(arm);
			      if(n1==u) {
			        System.out.println("the given number is strong number :"+u);
			      }
			      else {
			        System.out.println("the given number isn't strong number :"+n1);
			      }
			       
			      
			       
			      break;
		

	
}
			    
			    }
			  private void sum_of_first_n_numbers()
			    {
				  
			    	int sum =0;
			    	int no = 1;

			    	while(no<=10)
			    	{
			    		sum=sum+no;
			    		no=no+1;
			    	}
			    	System.out.println("Addition of First n numbers"+sum);
			    }

     


    	   private void multiples_of_3_or_5() {
    			// TODO Auto-generated method stub
    			
    			int no = 1; 
    			while(no<=30)	// | - pipe
    			{
    			if(no%3==0 || no%5==0)
    				{
    				System.out.print(no+"  "); 
    				}
    			no = no+1; 
    			}
    	   }
    			
    			
    			private void multiples_of_3_and_5() {
    				// TODO Auto-generated method stub
    				int no = 1; 
    				while(no<=30)	//& - ampersand
    				{
    				if(no%3==0 && no%5==0)
    					{
    					System.out.print(no+" "); 
    					}
    				no = no+1; 
    				}
    				
}
    			private void count_of_digits(int box) {
    				// TODO Auto-generated method stub
    				int count = 0; 
    				while(box>0)
    				{
    				System.out.println(box%10); 
    				count = count+1; 
    				box = box/10; 	
    				}
    				System.out.println("No. of Digits is "+ count);
    				
    			}
    			
    			
    			private void find_count_of_divisors(int no) {
    				// TODO Auto-generated method stub
    				int div = 2;
    				int count = 0; 
    				
    				while (div < no) {
    					if (no % div == 0) {
    						//System.out.print(div + " ");
    						count = count+1; 
    					}
    					div = div + 1;
    				}
    				System.out.println("No. of Divisors is "+ count);
    				
    			}
    			private void find_divisors(int no) {
    				// after selecting, ctrl + shift + f
    				int div = 2;
    				while (div < no) {
    					if (no % div == 0) {
    						System.out.print(div + " ");
    					}
    					div = div + 1;
    				}
    				
    			}
    			private void prime_or_not(int no) {
    				// TODO Auto-generated method stub
    				int div = 2;
    				int count = 0; 
    				
    				while (div < no) {
    					if (no % div == 0) {
    						//System.out.print(div + " ");
    						count = count+1; 
    					}
    					div = div + 1;
    				}
    				System.out.println("No. of Divisors is "+ count);
    				if(count==0)
    					System.out.println("Prime Number");
    				else
    					System.out.println("Not Prime Number");

    				
    			}
    			
    			private void print_no_in_reverse_order(int box) {
    				int box2 = box;
    				while(box>0)//1>0
    				{
    				System.out.println(box%10); 
    				int no = box%10; //1
    				//145

    				box = box/10; 	//1
    				}
    				
    				{
    					System.out.println("Strong Number");
    				}
    				
    			}
    			private int find_factorial(int max) {
    				// TODO Auto-generated method stub
    				int fact = 1; 
    				int no = 1; 
    				while(no<=max)
    				{
    				fact = fact * no; 
    				no = no+1; 
    				}
    				System.out.println("Factorial  is " + fact); 
    				
    				return fact; 
    				
    			}
    			private void find_palindrome(int no) {
    				// TODO Auto-generated method stub 
    				int no2 = no; 
    				int rev = 0; 
    				while(no>0)
    				{
    				int rem = no%10; 
    				rev = (rev*10) + rem; 
    				no = no/10; 
    				}

    				if(no2 == rev)
    					System.out.println("Palindrome");
    				else
    					System.out.println("Not Palindrome");
    				
    			}
    			private void reverse_no(int no) {
    				
    				int rev = 0; 
    				while(no>0)
    				{
    				int rem = no%10; 
    				rev = (rev*10) + rem; 
    				no = no/10; 
    				}	
    				System.out.println(rev);
    			}
    			
    			private void sum_of_digits(int box) {
    				// TODO Auto-generated method stub
    				int count = 0; 
    				int sum = 0; 
    				while(box>0)
    				{
    				int rem = box%10; 
    				sum = sum + rem;
    				//count = count+1; 
    				box = box/10; 	
    				}
    				
    		//System.out.println
    	//	("No. of Digits is "+ count);
    				
    				if(sum>9)
    				{
    					sum_of_digits(sum);
    				}
    				else
    				{
    					System.out.println("Sum of digits is "+ sum);
    				}
    				
    			} 
}


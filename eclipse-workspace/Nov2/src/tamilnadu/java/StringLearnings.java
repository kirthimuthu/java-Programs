package tamilnadu.java;

public class StringLearnings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		StringLearnings sl = new StringLearnings();
		//sl.charArrayToString();
		//sl.methods_String();
		//sl.check_first_letter("jeeva");
		//sl.count_of_vowels("muthu");
		//sl.print_only_numbers("preethi12345");
		//sl.print_only_chars("kiruthika12345");
		sl.print_only_spl_chars("naveenkumar_12345mail.com");
		
		
	}

	private void print_only_spl_chars(String name) {
		// TODO Auto-generated method stub
		for(int i=0; i<name.length();i++) {
			if(name.charAt(i)>='a' && name.charAt(i)<='z' )
			{	}
			else if(name.charAt(i)>='0' && name.charAt(i)<='9' )
			{ }
			else
				System.out.print(name.charAt(i)+" ");
		}
	}

	private void print_only_chars(String name) {
		// TODO Auto-generated method stub
		for(int i=0; i<name.length();i++) {
			if(name.charAt(i)>='a' && name.charAt(i)<='z' )
			System.out.print(name.charAt(i)+" ");
		}
		
	}

	private void print_only_numbers(String name) {
		// TODO Auto-generated method stub
		for(int i=0; i<name.length();i++) {
			if(name.charAt(i)>='0' && name.charAt(i)<='9' )
			System.out.print(name.charAt(i)+" ");
		}
		
	}

	private void count_of_vowels(String name) {
		// TODO Auto-generated method stub
		int count =0; 
		for(int i=0; i<name.length();i++)
		{
			if(name.charAt(i)=='a' || 
			   name.charAt(i)=='e' || 
			   name.charAt(i)=='i' || 
			   name.charAt(i)=='o' || 
			   name.charAt(i)=='u')
				count++; 
		}
		System.out.println(count);
		
	}

	private void check_first_letter(String name) {
		// TODO Auto-generated method stub
		char ch = name.charAt(0);
		if(ch =='j')
			System.out.println("Yes ");
		else
			System.out.println("No ");
		
	}

	private void methods_String() {
		// TODO Auto-generated method stub
		String name= "mathankumar";
		for(int i=0;i<name.length(); i++) 
		{
        System.out.print(name.charAt(i));
		}
		System.out.println();
		for(int i =name.length()-1;i>=0;i--)
		{
		System.out.print(name.charAt(i));
		}
		
	}

	private void charArrayToString() {
		// TODO Auto-generated method stub
		char data[] = {'a', 'b', 'c'};
		String str = new String(data);
		System.out.println(str);
	}

}

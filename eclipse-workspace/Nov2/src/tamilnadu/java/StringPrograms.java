package tamilnadu.java;

public class StringPrograms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      StringPrograms  sp = new StringPrograms();
     // sp.change_to_upper();
      //sp.change_to_lower();
     // sp.change_upto_upper("arunkumar");
     // String name = "arun"; String s2 = name.toUpperCase(); 
      //String s1 =name.toLowerCase();//
    			 
    // System.out.println(s1); System.out.println(s2);
    		
    			  //String name1 = "this is a temple"; String name2 = "is";
    			  //System.out.println(name1.startsWith(name2));
    			// System.out.println(name1.endsWith(name2));
    			  //System.out.println(name1.contains(name2));
    			  
    			  
    		sp.check_contains();
    		
      
	}

	private void check_contains() {
		// TODO Auto-generated method stub
		String s1 = "this was a temple";
		String s2 = "is";
		int j =0; boolean present = false; 
		for(int i=0; i<s1.length(); i++)
		{
			if(i!=0) {
			if((j==0 && s1.charAt(i-1)==' ') ||
					(j==s2.length()-1 && s1.charAt(i+1)==' '))
			{
				present = true; 
			}
			}
		if(s2.charAt(j) == s1.charAt(i))
			{
			//present = true; 
			
				j++; 
				if(s2.length() == j)
					break; 
			}
		}
		
		if(j==s2.length() && present==true)
		{
			System.out.println("Yes present");
		}
		else
		{
			System.out.println("Not Present");
		}
	}

	private void change_upto_upper(String name) {
		// TODO Auto-generated method stub
		name = "ARUNKUMAR";
		for(int i=0;i<name.length();i++)
		{
			char ch =name.charAt(i);
			if(i%2==0)
			{
				if(ch>='a' && ch<='z')
					System.out.print((char) (ch-32));	
			}
			else
				System.out.print(ch);
		}
	}

	private void change_to_lower() {
		// TODO Auto-generated method stub
		String name = "KIRUTHIKA";
		for(int i=0; i<name.length();i++)
		{
			char ch = name.charAt(i);
			if(ch>='A' &&  ch<='Z')
				System.out.print((char)(ch+32));
			else
				System.out.print(ch);
			
		}
	}

	private void change_to_upper() {
		// TODO Auto-generated method stub
		String name = "arunkumar";
		for(int i=0; i<name.length();i++)
		{
			char ch = name.charAt(i);
			if(ch>='a' && ch<='z')
				System.out.print((char)(ch-32));
			else
				System.out.print(ch);
			//System.out.print((char)(ch-32));
		}
	}

}

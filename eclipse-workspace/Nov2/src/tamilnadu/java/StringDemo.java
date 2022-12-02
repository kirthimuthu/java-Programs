package tamilnadu.java;

public class StringDemo {
	String name; 
	int no; 
	

	public StringDemo(String name, int no) {
		// TODO Auto-generated constructor stub
		this.name = name; 
		this.no = no; 
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			StringDemo sd = new StringDemo("Arunkumar",100); 
			/*
			 * System.out.println("sd object " + sd); System.out.println(sd.hashCode());
			 */
			StringDemo sd2 = new StringDemo("Chandrasaravanan", 120); 
			/*
			 * System.out.println(sd == sd2);//false: hashCode == hashCode
			 * System.out.println("22 " + sd.equals(sd2));
			 */
			System.out.println(sd);
			System.out.println(sd2);

			}
			
			public String toString()
			{
				//return this.name + " => " +this.no; 
				return this.no+""; 
			}
			public boolean equals(Object ob) // Implicit Casting
			{
					int no1 = this.no; 
					
				StringDemo sss = (StringDemo) ob; // E
					int no2 = sss.no; 
					if(no1==no2)
						return true;
					else
						return false; 
			}
	}



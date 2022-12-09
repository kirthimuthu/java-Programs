package tamilnadu.java;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.TreeSet;

public class CollectionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CollectionDemo cd = new CollectionDemo();
		//cd.learn_LinkedList();
		//cd.learn_Hashset();
		//cd.learn_LinkedHashset();
		//cd.learn_Treeset();
		//cd.learn_iteration(); 
		//cd.learn_iteration2(); 
		//cd.learn_Iteration3(); 
		//cd.learn_Iteration4(); 
		//cd.learn_Iteration5(); 
		cd.learn_Iteration6(); 

		
	}	
	
	private void learn_Iteration6() {
		// TODO Auto-generated method stub
		ArrayList al = new ArrayList(); 
		al.add(10);
		al.add("Hi");
		al.add(10.5f);
		al.add(true);
		al.add('c');
		al.add(18);
		al.add(7);
		for(Object ob: al)
		{
			try {
			Integer i = (Integer) ob; 
			System.out.println(i);
			}
			catch (ClassCastException e) {
				// TODO: handle exception
				//System.out.println("Check");
			}
		}
	}

	private void learn_Iteration5() {
		// TODO Auto-generated method stub
		ArrayList al = new ArrayList(); 
		Scanner sc = new Scanner(System.in);
		String  input = "Y"; 
		while(input.equals("Y"))
		{
			System.out.println("Enter Mark: ");
			int mark = sc.nextInt(); 
			al.add(mark);
			System.out.println("Press 'Y' to Continue");
			 input = sc.next(); 
		}
		System.out.println(al);
		
	}

	private void learn_Iteration4() {
		// TODO Auto-generated method stub
		ArrayList al = new ArrayList(); 
		al.add(10);
		al.add(20);
		al.add(10);
		al.add(15);
		al.add(12);
		al.add(18);
		al.add(7);
		 int total = 0; 
		for(Object ob: al)
		{
			Integer i = (Integer) ob; 
			total = total +i; 
				
		}
		System.out.println(total);
	}

	private void learn_Iteration3() {
		// TODO Auto-generated method stub
		ArrayList al = new ArrayList(); 
		al.add(10);
		al.add(20);
		al.add(10);
		al.add(15);
		al.add(12);
		al.add(15);
		al.add(7);
		LinkedHashSet lhs = new LinkedHashSet();
		for(Object ob: al)
		{
			boolean result = lhs.add(ob); 
			if(result==false)
				System.out.println(ob);
		}
		
	}

	private void learn_iteration2() {
		// TODO Auto-generated method stub
		ArrayList al = new ArrayList(); 
		al.add(10);
		al.add(20);
		al.add(10);
		al.add(15);
		al.add(12);
		al.add(18);
		al.add(7);
		LinkedHashSet lhs = new LinkedHashSet(al);
		System.out.println(lhs);
		
	}

	private void learn_iteration() {
		// TODO Auto-generated method stub
		ArrayList al = new ArrayList(); 
		al.add(10);
		al.add(20);
		al.add(10);
		al.add(15);
		al.add(12);
		al.add(18);
		al.add(7);
		 
		for(Object ob: al)
		{
			Integer i = (Integer) ob; 
			if(i%6==0)
				System.out.print(i+" ");
		}
		
		
	}
		

	private void learn_Treeset() {
		// TODO Auto-generated method stub
		
		TreeSet al = new TreeSet(); 
		al.add("Arunkumar");
		al.add("Aravind");
		al.add("Jeeva");
		System.out.println(al); }
		
		
		
		



	private void learn_LinkedHashset() {
		// TODO Auto-generated method stub
		LinkedHashSet al = new LinkedHashSet(); 
		al.add(5); // Integer
		al.add("Hi"); 
		al.add("Hi"); 
		al.add(true); 
		al.add(5.65f);
		System.out.println(al);
		
//System.out.println(al.get(2));
		System.out.println(al.contains("Hi"));
		al.remove(true); 
		System.out.println(al);
		LinkedHashSet al2 = new LinkedHashSet(); 
		al2.add("Gowthaman"); 
		al2.add("preethi");
		System.out.println(al2);//toString()//al2.ad(1, "jeeva");
		System.out.println(al2);//toString()
		al2.addAll(al); 
		System.out.println(al2);
		
//al2.add('j');
		System.out.println(al2.remove(3)); 
		System.out.println(al2.remove("Gowthaman"));
		System.out.println(al2);
		al2.removeAll(al);
		System.out.println(al2);
		al2.clear(); 
	}


	private void learn_Hashset() {
		// TODO Auto-generated method stub
		HashSet al = new HashSet(); 
		al.add(5); // Integer
		al.add("Hi"); 
		al.add("Hi");
		al.add(true); 
		al.add(5.65f);
		System.out.println(al);
		//System.out.println(al.get(2));
		System.out.println(al.contains("Hi"));
		al.remove(true); 
		System.out.println(al);
		HashSet al2 = new HashSet(); 
		al2.add("Gowthaman"); 
		al2.add("preethi");
		System.out.println(al2);//toString()
		//al2.add(1, "jeeva");
		System.out.println(al2);//toString()
		al2.addAll(al); 
		System.out.println(al2);
		
//al2.add('j');
		System.out.println(al2.remove(3)); 
		System.out.println(al2.remove("Gowthaman"));
		System.out.println(al2);
		al2.removeAll(al);
		System.out.println(al2);
		al2.clear(); 
	}


	private void learn_LinkedList() {
		// TODO Auto-generated method stub
		LinkedList al = new LinkedList(); 
		al.add(5); // Integer
		al.add("Hi"); 
		al.add(true); 
		al.add(5.65f);
		System.out.println(al);
		System.out.println(al.get(2));
		System.out.println(al.contains("Hi"));
		al.remove(true); 
		System.out.println(al);
		LinkedList al2 = new LinkedList(); 
		al2.add("Gowthaman"); 
		al2.add("preethi");
		System.out.println(al2);//toString()
		al2.add(1, "jeeva");
		System.out.println(al2);//toString()
		al2.addAll(al); 
		System.out.println(al2);
		System.out.println(al2.remove(3)); 
		System.out.println(al2.remove("Gowthaman"));
		System.out.println(al2);
		al2.removeAll(al);
		System.out.println(al2);
		al2.clear(); 
	}

}

package tamilnadu.java;

import java.util.ArrayList;

public class CollectionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CollectionDemo cd = new CollectionDemo();
		cd.learn_ArrayList();
	}	
		

	private void learn_ArrayList() {
		// TODO Auto-generated method stub
		ArrayList al = new ArrayList(); 
		al.add(5); // Integer
		al.add("Hi"); 
		al.add(true); 
		al.add(5.65f);
		System.out.println(al); 
		System.out.println(al.get(2));
		System.out.println(al.contains("Hi")); 
		al.remove(true); 
		System.out.println(al); 
	}

}

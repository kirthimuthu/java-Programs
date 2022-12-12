package tamilnadu.java;

import java.util.ArrayList;

public class GenericsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
			ArrayList<Integer> al = new ArrayList<Integer>();
			al.add(5);
			al.add(45);
			al.add(10);
			GenericsDemo gd = new GenericsDemo();
			gd.calculate(al);
			
		}

		public void calculate(ArrayList<Integer> al) {
			// TODO Auto-generated method stub
			int total =0;
			for(Object ob: al)
			{
				total = total + (Integer) ob;
				//System.out.println(ob);
			}
			System.out.println(total);
			
		}

	
	}



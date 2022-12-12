package tamilnadu.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class CollectionsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CollectionsDemo cd = new CollectionsDemo();
		cd.learn_Real();
		//cd.learn_iterator();

			}

			private void learn_iterator() {
				// TODO Auto-generated method stub
				ArrayList al = new ArrayList();
				al.add(5);
				al.add(10);
				al.add(3);
				al.add(7);
				Iterator it = al.iterator();
				boolean present = it.hasNext();
				while(present == true)
				{
					Integer i = (Integer)it.next();
					if(i%5==0)
					System.out.println(i);
					present = it.hasNext();
				}
				
				
				
			}

			private void learn_Real() {
				// TODO Auto-generated method stub
				Mobiles m1 = new Mobiles(15000, 8, 5.5f, "Apple");
				Mobiles m2 = new Mobiles(38000, 8, 6.5f, "Samsung");
				Mobiles m3 = new Mobiles(22000, 4, 5.0f, "Vivo");
				Mobiles m4 = new Mobiles(28000, 16, 7.5f, "Oneplus");
				ArrayList<Mobiles> al = new ArrayList<Mobiles>();
				al.add(m1);
				al.add(m2);
				al.add(m3);
				al.add(m4);
				System.out.println(al);
				Collections.sort(al);
				System.out.println(al);
				
			}

		
	}



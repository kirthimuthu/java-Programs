package tamilnadu.java;

		public class Laptops implements Comparable {
			String brand;
			int price; 

			public Laptops(String brand, int price) {
				// TODO Auto-generated constructor stub
				this.brand = brand; 
				this.price = price; 
			}

			public static void main(String[] args) {
				// TODO Auto-generated method stub
				Laptops lap1 = new Laptops("lenovo", 38000);
				Laptops lap2 = new Laptops("hp", 38000);
				Laptops lap3 = new Laptops("dell", 31000);
				System.out.println(lap1.brand);
				System.out.println(lap2.brand);
				
				int result = lap1.compareTo(lap2); 
				System.out.println(result);
				if(result>0)
					System.out.println("Lap1 is costlier than Lap2");
				else if(result<0)
					System.out.println("Lap2 is costlier than Lap1");
				else
					System.out.println("Lap1 is equal to Lap2");

			}

			@Override
			public int compareTo(Object ob) { // Upcasting
				// TODO Auto-generated method stub
				int price1 = this.price;
				Laptops ll = (Laptops)ob; 
				int price2 = ll.price; 
				if(price1>price2)
					return 1234; 
				else if(price1<price2)
					return -567;
				else
					return 0;
			}
	}



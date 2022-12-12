package tamilnadu.java;

public class Mobiles implements Comparable {

int price, ram;
float screensize;
String brand;

public Mobiles(int price, int ram, float screensize, String brand) {
	//super();
	this.price = price;
	this.ram = ram;
	this.screensize = screensize;
	this.brand = brand;
}
public String toString()
{
	return this.brand + "  "+ this.price;
	
}
//Metadata - Data about data
@Override
public int compareTo(Object o) {
	// TODO Auto-generated method stub
	Mobiles m1 = (Mobiles) o;
	int price1 = m1.price;
	int price2 = this.price;
	System.out.println(price1 + "  --> "+ price2);
	if(price1>price2)
		return +657;
	else if(price1<price2)
		return -89;
	return 0;
}
}

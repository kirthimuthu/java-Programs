package tamilnadu.java;

public class Perfect {


	public static void main(String[] args) {
		int i = 1, Number, Sum = 0 ;
		//Scanner sc = new Scanner();		
		System.out.println("Please Enter any Number: ");
		Number = 1;

		while(i < Number) {
			if(Number % i == 0)  {
				Sum = Sum + i;
			}
			i++;
		}
		if (Sum == Number) {
			System.out.format("%d is a Perfect Number", Number);
		}
		else {
			System.out.format("%d is NOT a Perfect Number", Number);
		}
	}
}
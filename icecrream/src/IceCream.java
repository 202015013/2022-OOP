package icecream;

import java.util.Scanner;

public class IceCream {
	String type;
	String name;
	int price;
	
	public IceCream(String type) {
		// TODO Auto-generated constructor stub
		this.type = type;
	}

	public void read(Scanner scan) {
		// TODO Auto-generated method stub
		//type = scan.next();
		name = scan.next();
		price = scan.nextInt();		
	}

	public void print() {
		// TODO Auto-generated method stub
		System.out.printf(" %s(%s) %d원\n", name, type, price);
	}

	public boolean matches(String kwd) {
		// TODO Auto-generated method stub
		return (type.equals(kwd) ||
				name.contains(kwd) ||
				("" + price).equals(kwd));
	}

}

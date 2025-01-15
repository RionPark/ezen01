package d0115;

import java.util.Random;
import java.util.Scanner;

class Variable2{
	int i;
	String str;
	
	public static void main(String[] args) {
		
		String str = new String("asdf");
		Scanner s= new Scanner(System.in);
		Random r = new Random();
		Variable2 v = new Variable2();
		System.out.println(v.i);
		System.out.println(v.str);
	}
}

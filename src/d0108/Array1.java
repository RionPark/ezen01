package d0108;

import java.util.Random;

public class Array1 {

	public static void main(String[] args) {
		//난수 
		Random r = new Random();
		int[] ages = new int[10];
		for(int i=0;i<10;i++) {
			ages[i] = r.nextInt(100)+1;
		}
		

		for(int i=0;i<10;i++) {
			System.out.println(ages[i]);
		}
	}
}

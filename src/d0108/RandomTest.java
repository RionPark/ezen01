package d0108;

import java.util.Random;

public class RandomTest {

	public static void main(String[] args) {
		Random r = new Random();
		int num = r.nextInt(100)+1; //1-100
		System.out.println(num);
	}
}

package d0113;

import java.util.Random;

public class Duple2 {

	public static void main(String[] args) {
		int[] nums = new int[5];
		// nums에 1부터 6까지의 난수를 입력해주세요.
		Random r = new Random();
		for(int i=0;i<nums.length;i++) {
			nums[i] = r.nextInt(6)+1;
		}
		
		for(int i=0;i<nums.length;i++) {
			System.out.println(nums[i]);
		}
	}
}

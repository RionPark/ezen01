package d0108;

import java.util.Random;

public class Lotto {

	public static void main(String[] args) {
		Random r = new Random();
		int[] nums = new int[6];
		
		// Array1을 참고하여 1-45까지 난수를 nums의 각 방에 대입하고
		// 출력하는 for문을 만들어 보세요.
		for(int i=0;i<nums.length;i++) {
			nums[i] = r.nextInt(45) + 1;
		}
		for(int i=0;i<nums.length;i++) {
			System.out.println(nums[i]);
		}
	}
}

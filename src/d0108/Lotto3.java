package d0108;
	
import java.util.Random;

public class Lotto3 {

	public static void main(String[] args) {
		int[] nums = new int[3];
		Random r = new Random();
		for(int i=0;i<3;i++) {
			nums[i] = r.nextInt(100);
		}
		for(int i=0;i<3;i++){
			System.out.println(nums[i]);
		}
	}
}

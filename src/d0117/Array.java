package d0117;

public class Array {

	
	public static void main(String[] args) {
		int[] nums = new int[2];
		nums[0] = 20;
		nums[1] = 22;
		
		int[] tmps = nums; //{20,22} 2
		nums = new int[nums.length+1]; //3
		for(int i=0;i<tmps.length;i++) {//012
			nums[i] = tmps[i];
		}
		
	}
}

package d0103;

public class Odd {

	public static void main(String[] args) {
		// 1부터 100까지 출력을 하되 홀수 일때만 출력되게 해주세요.
		
		for(int i=1;i<=100;i++) {
			if(i%2==1) {
				System.out.println(i);
			}
		}
	}
}

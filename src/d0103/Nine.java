package d0103;

public class Nine {

	public static void main(String[] args) {
		for(int i=1;i<=100;i++) {
			if(i % 10 == 9 || i /10 == 9) {
				System.out.println(i + "짝");
			}
		}
	}
}

package d0103;

public class Six {

	public static void main(String[] args) {
		for(int i=1;i<=100;i++) {
			if(i % 10 == 6 || i / 10 == 6) {
				System.out.println(i + "짝");
			}
		}
	}
}

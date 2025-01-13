package d0113;

public class Loop2 {

	public static void main(String[] args) {
		for(int i=1;i<10;i++) {
			for(int j=1;j<10;j++) {
				System.out.print(j + " X " + i + " = " + (j*i));
				System.out.print(",");	
			}	
			System.out.println();
		}
	}
}

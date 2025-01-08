package d0103;

public class DataType2 {

	public static void main(String[] args) {
		int i = 1;
		byte b = (byte)i;
		i = b;
		
		String str1 = i + "";
		System.out.println(str1);
		
		i = Integer.parseInt(str1);
		System.out.println(i);
		
 	}
}

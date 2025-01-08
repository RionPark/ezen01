package d1230;

public class DataType2 {
	public static void main(String[] args) {
		int i = 10;
		System.out.println(i==10);
		i = 11;
		int i2 = 20;
		System.out.println(i+i2);
		System.out.println(i-i2);
		System.out.println(i/i2);
		System.out.println(i*i2);
		
		byte b = 127;
		short s = 127;
		s = b; //short가 byte보다 크기 때문에 문제가 없음
		b = (byte)s;
		
		int num = 1000000000;
		long l = 10000000000L;
		
		float f = 1.1F;
		double db = 1.1;
		
	}
}

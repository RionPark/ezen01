package d0117;

public class Static3 {
	static int age = 10;
	int age2;
	public static void main(String[] args) {
		
		Static3 s1 = new Static3();
		System.out.println(s1.age); //10
		System.out.println(s1.age2);//0
		s1.age = 20;
		s1.age2 = 10;
		Static3 s2 = new Static3();
		System.out.println(s2.age); //10
		System.out.println(s2.age2);//0
	}
}

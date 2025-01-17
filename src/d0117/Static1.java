package d0117;

public class Static1 {

	int n1;
	int n2;
	
	void test() {
		System.out.println("전 test입니다.");
	}
	
	public static void main(String[] args) {
//		n1 = 1;
		Static1 s = new Static1();
		s.n1 = 1;
		s.test();
	}
}

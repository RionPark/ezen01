package d1230;

public class Gugudan {
	<T> void test1(T t) {
		System.out.println(t);
	}
	
	static <T> void test2(T t) {
		System.out.println(t);
	}
	
	public static void main(String[] args) {
		Gugudan g = new Gugudan();
		g.test1(1);
		Gugudan.test2("asdf");
		Gugudan.test2(1);
		
		
	}
}

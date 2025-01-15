package d0113;

public class Test {

	public static void main(String[] args) {
		int num1 = 10; //내가 쓴 숫자
		int num2 = 11; //랜덤 숫자
		System.err.println("숫자를 입력하세요 : ");
		
		while(num1!=num2) {
			if(num1<num2) {
				System.out.println("Down");
			}else if(num1>num2) {
				System.out.println("Up");
			}
			System.err.println("숫자를 입력하세요 : ");
		}
		
		System.out.println("맞췄다");
	}
}

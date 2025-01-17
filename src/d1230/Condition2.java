package d1230;

public class Condition2 {

	public static void main(String[] args) {
		int age = 33;
		
		if(age<10) {
			System.out.println("애기구나");
		}else if(age<20){
			System.out.println("10대구나");
		}else if(age<40) {
			System.out.println("20대구나");
		}
		if(age<40) {
			System.out.println("30대구나");
		}else {
			System.out.println("먹을만큼 먹었꾸나");
		}
	}
}

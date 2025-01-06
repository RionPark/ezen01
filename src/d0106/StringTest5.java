package d0106;

public class StringTest5 {

	public static void main(String[] args) {
		String str1 = "안녕하십니까?하";
		for(int i=0;i<str1.length();i++) {
			String str = str1.substring(i,i+1);
			if("하".equals(str)) {
				System.out.println(i);
			}
		}

		System.out.println(str1.indexOf("하"));
		System.out.println(str1.lastIndexOf("하"));
	}
}

package yufjin.software.nju.edu.cn;

public class StringTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String str = "abc";
		String str1 = new String("abc");
		String str2 = "abc";
		String str3 = "abc";
		//System.out.println(str == str1);
		System.out.println(str1 == str2);
	//	System.out.println(str == str2);
		//System.out.println(str == str3);
		System.out.println(str2 == str3);
		System.out.println(str1 == str3);
	}

}

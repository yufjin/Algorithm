package yufjin.software.nju;

public class Test1 {
	public static int k = 0;
	public static Test1 t1 = new Test1("t1");
	public static Test1 t2 = new Test1("t2");
	public static int i = print("i");
	public static int n = 99;
	public int j = 0;
	{
		print("�����");
	}
	static {
		print("��̬��");
	}
	
	public Test1(String str) {
		System.out.println((++k) + ":" + str + "    i = " + i + "    n = " + n );
		++i;
		++n;
	}
	
	public static int print(String str) {
		System.out.println((++k) + ":" + str + "    i = " + i + "    n = " + n );
		++n;
		return ++i;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test1 test = new Test1("init");
	}

}
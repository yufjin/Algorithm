package yufjin.software.nju.edu.cn;

public class TestStudent {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student zhouxingxing = new Student();
		zhouxingxing.stuId = "9527";
		zhouxingxing.stuName ="zhouxingxing";
		zhouxingxing.stuAge = 25;
		
		Student qiuxiang = new Student();
		qiuxiang.stuId = "9526";
		qiuxiang.stuName = "qiuxiang";
		qiuxiang.stuAge = 22;
		
		Student temp = qiuxiang;
		qiuxiang = zhouxingxing;
		zhouxingxing = temp;
		
		System.out.println(zhouxingxing.stuAge);
		System.out.println(zhouxingxing.stuId);
		System.out.println(zhouxingxing.stuName);
		
		System.out.println(qiuxiang.stuAge);
		System.out.println(qiuxiang.stuId);
		System.out.println(qiuxiang.stuName);
	}

}

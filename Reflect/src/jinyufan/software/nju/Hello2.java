package jinyufan.software.nju;

public class Hello2 {
	 public static void main(String[] args) {
	        Class<?> demo=null;
	        try{
	            demo=Class.forName("jinyufan.software.nju.Person");
	        }catch (Exception e) {
	            e.printStackTrace();
	        }
	        //ȡ�ø���
	        Class<?> temp=demo.getSuperclass();
	        System.out.println("�̳еĸ���Ϊ��   "+temp.getName());
	    }
}

package jinyufan.software.nju;

public class Hello2 {
	 public static void main(String[] args) {
	        Class<?> demo=null;
	        try{
	            demo=Class.forName("jinyufan.software.nju.Person");
	        }catch (Exception e) {
	            e.printStackTrace();
	        }
	        //取得父类
	        Class<?> temp=demo.getSuperclass();
	        System.out.println("继承的父类为：   "+temp.getName());
	    }
}

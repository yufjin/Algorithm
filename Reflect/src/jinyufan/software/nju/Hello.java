package jinyufan.software.nju;

public class Hello {
	public static void main(String[] args) {
        Class<?> demo=null;
        try{
            demo=Class.forName("jinyufan.software.nju.Person");
        }catch (Exception e) {
            e.printStackTrace();
        }
        //�������еĽӿ�
        Class<?> intes[]=demo.getInterfaces();
        for(Class<?> inte: intes){
        	System.out.println(inte);
        }
        
        
        for (int i = 0; i < intes.length; i++) {
            System.out.println("ʵ�ֵĽӿ�   "+intes[i].getName());
        }
    }
}

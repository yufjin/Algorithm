package yufjin.software.nju;

import java.lang.reflect.Constructor;

public abstract class Hello {
    public static void main(String[] args) {
        Class<?> demo=null;
        try{
            demo=Class.forName("yufjin.software.nju.Person");
        }catch (Exception e) {
            e.printStackTrace();
        }
        Person per1=null;
        Person per2=null;
        Person per3=null;
        Person per4=null;
        //取得全部的构造函数
        Constructor<?> cons[]=demo.getConstructors();
        for(Constructor<?> con:cons){
        	System.out.println(con.toString());
        }
        try{
            per1=(Person)cons[0].newInstance("Rollen",20);//notice that the order of constructor can not by changed
            per2=(Person)cons[1].newInstance(20);
            per3=(Person)cons[2].newInstance("Rollen");
            per4=(Person)cons[3].newInstance();
        }catch(Exception e){
            e.printStackTrace();
        }
        System.out.println(per1);
        System.out.println(per2);
        System.out.println(per3);
        System.out.println(per4);
    }
}

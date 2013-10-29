package yufjin.software.nju;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

public class HelloKitty {

    public static void main(String[] args) {
        Class<?> demo=null;
        try{
            demo=Class.forName("yufjin.software.nju.Person");
        }catch (Exception e) {
            e.printStackTrace();
        }
        Constructor<?> cons[]=demo.getConstructors();
        for (int i = 0; i < cons.length; i++) {
            Class<?> p[]=cons[i].getParameterTypes();
            System.out.print("构造方法：  ");
            int mo=cons[i].getModifiers();
            System.out.print(Modifier.toString(mo)+" ");
            System.out.print(cons[i].getName());
            System.out.print("(");
            for(int j=0;j<p.length;++j){
                System.out.print(p[j].getName()+" arg"+i);
                if(j<p.length-1){
                    System.out.print(",");
                }
            }
            System.out.println("){}");
        }
    }
}

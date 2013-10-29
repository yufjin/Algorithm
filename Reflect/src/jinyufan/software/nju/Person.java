package jinyufan.software.nju;

public class Person implements China {

	private String sex;
	
	public Person() {
         
    }
    public Person(String sex){
        this.sex=sex;
    }
    public String getSex() {
        return sex;
    }
    public void setSex(String sex) {
        this.sex = sex;
    }
	@Override
	public void sayChina() {
		// TODO Auto-generated method stub
		 System.out.println("hello ,china");
	}

	@Override
	public void sayHello(String name, int age) {
		// TODO Auto-generated method stub
		System.out.println(name+"  "+age);
	}

}

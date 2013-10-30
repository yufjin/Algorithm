package yufjin.software.nju.edu.cn;

public class Singleton {
	private static Singleton instance;
	private String name;
	private Singleton(){
		this.name = "helloworld";
	}
	public static synchronized Singleton getInstance() {
		if(instance == null) {
			instance = new Singleton();
		}
		return instance;
	}
	
	public  String getName(){
		return name;
	}
	
}

package yufjin.software.nju.edu.cn;

public class ConcreteObserver1 implements Observer {
	
	public String name = "ConcreteObserver1";
	@Override
	public void update() {
		// TODO Auto-generated method stub
		System.out.println(name + "updateing...");
	}

}

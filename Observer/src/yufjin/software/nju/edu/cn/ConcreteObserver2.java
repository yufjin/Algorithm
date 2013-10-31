package yufjin.software.nju.edu.cn;

public class ConcreteObserver2 implements Observer {
	public String name = "ConcreteObserver2";
	@Override
	public void update() {
		// TODO Auto-generated method stub
		System.out.println(name + "updateing...");
	}

}

package yufjin.software.nju.edu.cn;

public class ObserverTest {
	public static void main(String[] args) {
		Subject sub = new ConcreteSubject();
		Observer obs1 = new ConcreteObserver1();
		Observer obs2 = new ConcreteObserver2();
		sub.attach(obs1);
		sub.attach(obs2);
		sub.notifyObservers();
	}
}

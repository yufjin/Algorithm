package yufjin.software.nju.edu.cn;

import java.util.ArrayList;





public class ConcreteSubject implements Subject {
	private ArrayList<Observer> observersVector = new ArrayList<Observer>();
	
	@Override
	public void attach(Observer observer) {
		// TODO Auto-generated method stub
		observersVector.add(observer);
	}

	@Override
	public void detach(Observer observer) {
		// TODO Auto-generated method stub
		observersVector.remove(observer);
	}

	@Override
	public void notifyObservers() {
		// TODO Auto-generated method stub
		for(Observer obs:observersVector) {
			obs.update();
		}

	}
	
	
	
}

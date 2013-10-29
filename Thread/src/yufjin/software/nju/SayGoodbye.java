package yufjin.software.nju;

public class SayGoodbye implements Runnable {
	private String name;
	
	public SayGoodbye(String name) {
		this.name = name;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 11; i++) {
            System.out.println(name + " is running " + i + " times!!!!");
        }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SayGoodbye sayg1 = new SayGoodbye("A");
		SayGoodbye sayg2 = new SayGoodbye("B");
		Thread thr1 = new Thread(sayg1);
		Thread thr2 = new Thread(sayg2);
		thr1.start();
		thr2.start();
	}

}

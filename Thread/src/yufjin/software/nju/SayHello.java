package yufjin.software.nju;

/**
 * @author jyf
 *
 */
public class SayHello extends Thread{
	
	private String name;

	public SayHello (String name) {
		this.name = name;
	}
	public void run() {
		for (int i = 0; i < 11; i++) {
            System.out.println(name + " is running " + i + " times!!!!");
        }
	}
	public static void main(String[] args) {
		SayHello sayh1 = new SayHello("A");
		SayHello sayh2 = new SayHello("B");
		sayh1.start();
		sayh2.start();
	}
}

package yufjin.software.nju.edu.cn;

import javax.swing.JFrame;

public class SwingTesting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JframeCreate();
	}
	
	public static void JframeCreate(){
		JFrame f = new JFrame("Hello World!");
        f.setBounds(100, 100, 400, 400);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
        
	}

}

package view;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;



import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JTextField;


public class SudokuView implements ISudokuView{
	private JFrame view = new JFrame("Sudoku");
	private JTextField[][] cells = new JTextField[9][9];
	private ActionListener inputlistener = new InputListener();
	public SudokuView(){
		viewInit();
	}
	
	public void viewInit(){
		view.setBounds(100, 100, 485, 507);
		view.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    view.setVisible(true);
	    Container container = view.getContentPane();
	    

		for(int i=0;i<9;i++){
	    	for(int j=0;j<9;j++){
	    		cells[i][j] = new JTextField();
	    		container.add(cells[i][j]);
	    	}
	    }
		for(int i=0;i<9;i++){
	    	for(int j=0;j<9;j++){
	    		cells[i][j].addActionListener(inputlistener);
	    		cells[i][j].setHorizontalAlignment(JTextField.CENTER);
	    		cells[i][j].setBounds(j*52+2, i*52+2, 50, 50);
	    		if((i/3+j/3)%2 == 0){
	    			cells[i][j].setBackground(new Color(255,255,255));
	    		}else{
	    			cells[i][j].setBackground(new Color(240,240,240));
	    		}
	    		
	    	}
	    }
	}

	@Override
	public void setDefaultValue(int i, int j,int value) {
		// TODO Auto-generated method stub
		cells[i][j].setFont(new Font("Arial", Font.PLAIN, 30));
		cells[i][j].setText(String.valueOf(value));
		cells[i][j].setDisabledTextColor(new Color(205,92,92));
		cells[i][j].disable();
	}

	@Override
	public void getValue(int i, int j) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setPossibilities(int i, int j, int[] possibilities) {
		// TODO Auto-generated method stub
		cells[i][j].setFont(new Font("Arial", Font.PLAIN, 10));
		String poss = "";
		for (int m:possibilities){
			poss = poss+m+" ";
		}
		cells[i][j].setText(poss);
		cells[i][j].setDisabledTextColor(Color.BLACK);
	}
	

}

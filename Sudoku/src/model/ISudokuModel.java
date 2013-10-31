package model;

import java.util.ArrayList;

public interface ISudokuModel {
	public void modelInit();
	public void puzzleCreate();
	public int answerCalculate();
	public boolean hasUniqueAnswer();
	public boolean isRightNumber();
	public boolean isSafe();
	public boolean rowCheck();
	public boolean columnCheck();
	public boolean cubeCheck();
	public ArrayList<String> showAll(int n);//return all the index of special number
}

package model;

import java.util.ArrayList;


public interface ISudokuModel {
	public int[][] getModel();
	public void setModel(int[][] modelArchetype);
	public void answerInit();
	public void puzzleCreate();
	public ArrayList<Integer[]> answerCalculate();
	public boolean hasUniqueAnswer();
	public boolean isRightNumber(int i,int j);
	public boolean isSafe(int i,int j);
	public boolean rowCheck(int i,int j);
	public boolean columnCheck(int i,int j);
	public boolean cubeCheck(int i,int j);
	public int[] showAllPossibilities(int i,int j);//return all the index of special number
	public void setValue(int i,int j,int value);
	public void deleteValue(int i,int j);
	public void Hint(int i,int j);
	public void updatePossibilities(int i,int j);//after set value, the possibilities of related cell should be update
	public int[][] getAnswer();
	public int[][] getPuzzle();
	public void puzzleProducer();
}

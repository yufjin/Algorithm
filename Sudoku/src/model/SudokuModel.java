package model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

import sun.beans.editors.IntEditor;

public class SudokuModel implements ISudokuModel{
	private int [][] model = new int[9][9];
	private int [][] answer = new int[9][9];

	@Override
	public int[][] getModel() {
		// TODO Auto-generated method stub
		return this.model;
	}

	@Override
	public void setModel(int[][] modelArchetype) {
		// TODO Auto-generated method stub
		for(int i=0;i<modelArchetype.length;i++){
			for(int j=0;j<modelArchetype.length;j++){
				this.model[i][j] = modelArchetype[i][j];
			}
		}
	}

	@Override
	public void modelInit() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void puzzleCreate() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ArrayList<Integer[]> answerCalculate() {
		// TODO Auto-generated method stub
		ArrayList<Integer[]> cell = new ArrayList<Integer[]>(); //record all the puzzle cell for recall
		for(int m=0;m<this.model.length;m++){
			for(int n=0;n<this.model.length;n++){
				if(this.model[m][n] == 0){
					Integer[] index = {Integer.valueOf(m),Integer.valueOf(n)};
					cell.add(index);
				}
			}
		}
		ArrayList<Integer[]> answers = new ArrayList<Integer[]>();//record answers
		int a = 0;
		while(a < cell.size() && a>=0) {
			int i = cell.get(a)[0];
			int j = cell.get(a)[1];
			if(this.model[i][j] >=0 && this.model[i][j]<9){//go through from 1 to 9
				this.model[i][j]++;
				if(!isSafe(i, j)){//not safe, go back

				}else if(a != cell.size()-1){//have noe finished yet
					a++;
				}else{//I don't whether it works well
					Integer[] temp = new Integer[cell.size()];
					int x = 0;
					for(Integer[] index:cell){
						temp[x] = this.model[index[0]][index[1]];
						x++;
					}
					answers.add(temp);//add the current answer to the arraylist
				}
			}else if(this.model[i][j] == 9){
				this.model[i][j] = 0;
				a--;
			}
			
		}
		for(Integer[] answer:answers){
			for(Integer an:answer){
				System.out.print(an+" ");
			}
		}
		
		return answers;
	}

	@Override
	public boolean hasUniqueAnswer() {
		// TODO Auto-generated method stub
		if(answerCalculate().size() == 1){
			return true;
		}else{
			return false;
		}
	}

	@Override
	public boolean isRightNumber(int i,int j) {
		// TODO Auto-generated method stub
		if(this.answer[i][j]==this.model[i][j]){
			return true;
		}else{
			return false;
		}
	}

	@Override
	public boolean isSafe(int i,int j) {
		// TODO Auto-generated method stub
		if(rowCheck(i, j) && columnCheck(i, j) && cubeCheck(i, j)){
			return true;
		}else{
			return false;
		}	
	}

	@Override
	public boolean rowCheck(int i,int j) {
		// TODO Auto-generated method stub
		for(int n=0;n<this.model.length;n++){
			if(this.model[i][n] == this.model[i][j] && n!=j){
				//System.out.println("rowCheck returns false");
				return false;
			}
		}
		//System.out.println("rowCheck returns true");
		return true;
	}

	@Override
	public boolean columnCheck(int i,int j) {
		// TODO Auto-generated method stub
		for(int n=0;n<this.model.length;n++){
			if(this.model[n][j] == this.model[i][j] && n!= i){
				//System.out.println("columnCheck returns false");
				return false;
			}
		}
		//System.out.println("columnCheck returns true");
		return true;
	}

	@Override
	public boolean cubeCheck(int i,int j) {
		// TODO Auto-generated method stub
		int offsetI = i/3;
		int offsetJ = j/3;
		for(int m=offsetI*3;m<offsetI*3+3;m++){
			for(int n=offsetJ*3;n<offsetJ*3+3;n++){
				if(this.model[m][n] == this.model[i][j] && !(m==i && n==j)){
					//System.out.println("cubeCheck returns false");
					return false;
				}
			}
		}
		//System.out.println("cubeCheck returns true");
		return true;
	}

	@Override
	public int[] showAllPossibilities(int i,int j) {
		// TODO Auto-generated method stub
		int[] possibilites = {1,2,3,4,5,6,7,8,9};
		HashSet<Integer> conflictset = new HashSet<Integer>();
		for(int m=0;m<this.model.length;m++){
			conflictset.add(this.model[i][m]);
		}
		for(int n=0;n<this.model.length;n++){
			conflictset.add(this.model[n][j]);
		}
		int offsetI = i/3;
		int offsetJ = j/3;
		for(int m=offsetI*3;m<offsetI*3+3;m++){
			
			for(int n=offsetJ*3;n<offsetJ*3+3;n++){
				conflictset.add(this.model[m][n]);
			}
		}
		for(int p=0;p<possibilites.length;p++){
			if(conflictset.contains(possibilites[p])){
				possibilites[p] = 0;
			}
		}
		//notice that the conflict always has a dirty data of 0, so the size needs to -1
		int[] poss = new int[possibilites.length - (conflictset.size() - 1)]; 
		int index = 0;
		for(int p=0;p<possibilites.length;p++){
			if(possibilites[p]!=0) {
				poss[index] = possibilites[p];
			//	System.out.print(poss[index]+" ");
				index++;
				
			}
		}
		return poss;
	}

	@Override
	public void showModel() {
		// TODO Auto-generated method stub
		System.out.print("=========================================");
		for(int i=0;i<this.model.length;i++){
			System.out.println("");
			for(int j=0;j<this.model.length;j++){
				if(this.model[i][j]!=0){
					System.out.print(" "+this.model[i][j]+"  ");
				}else{
					System.out.print("[ ] ");
				}if(j==2 || j==5){
					System.out.print("| ");
				}
				
			}
			System.out.println("");
			if(i==2 || i==5){
				System.out.println("-----------------------------------------");
			}
		}
		System.out.println("=========================================");
	}

	@Override
	public void setValue(int i, int j, int value) {
		// TODO Auto-generated method stub
		this.model[i][j] = value;
		
	}

	@Override
	public void deleteValue(int i, int j) {
		// TODO Auto-generated method stub
		this.model[i][j] = 0;
	}

	@Override
	public void Hint(int i, int j) {
		// TODO Auto-generated method stub
		this.model[i][j] = this.answer[i][j];
	}

	@Override
	public void updatePossibilities(int i, int j) {
		// TODO Auto-generated method stub
		if(isSafe(i, j)){
			
		}
	}

	
}

package test;

import model.ISudokuModel;
import model.SudokuModel;

public class SudokuTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ISudokuModel sudoku =new SudokuModel();
		sudoku.setModel(createArchetype());
		
		sudoku.setValue(7, 7, 1);
		sudoku.showModel();
		sudoku.isSafe(7, 7);
	}
	
	public static int[][] createArchetype(){
		int[][] modelArchetype = new int[9][9];
		modelArchetype[0][2] = 2;
		modelArchetype[0][3] = 5;
		modelArchetype[0][8] = 9;
		modelArchetype[1][1] = 1;
		modelArchetype[1][7] = 4;
		modelArchetype[2][0] = 9;
		modelArchetype[2][3] = 1;
		modelArchetype[3][3] = 4;
		modelArchetype[3][5] = 6;
		modelArchetype[3][6] = 9;
		modelArchetype[3][7] = 8;
		modelArchetype[4][0] = 7;
		modelArchetype[4][7] = 6;
		modelArchetype[5][4] = 8;
		modelArchetype[5][8] = 3;
		modelArchetype[6][3] = 2;
		modelArchetype[6][6] = 3;
		modelArchetype[6][8] = 8;
		modelArchetype[7][1] = 4;
		modelArchetype[7][5] = 3;
		modelArchetype[7][8] = 7;
		modelArchetype[8][0] = 6;
		modelArchetype[8][1] = 3;
		return modelArchetype;
	}

}

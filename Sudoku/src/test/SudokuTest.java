package test;

import model.ISudokuModel;
import model.SudokuModel;

public class SudokuTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ISudokuModel sudoku =new SudokuModel();
		sudoku.setModel(createArchetype());
		
		//sudoku.setValue(7, 7, 1);
		sudoku.showModel();
		//boolean flag = sudoku.isSafe(7, 7);
		sudoku.showAllPossibilities(8, 8);
	}
	
	public static int[][] createArchetype(){
		int[][] modelArchetype = new int[9][9];
		modelArchetype[0][0] = 6;
		modelArchetype[0][3] = 3;
		modelArchetype[0][6] = 1;
		
		modelArchetype[1][1] = 7;
		modelArchetype[1][2] = 1;
		modelArchetype[1][3] = 6;
		modelArchetype[1][4] = 2;
		
		modelArchetype[2][0] = 8;
		modelArchetype[2][2] = 5;
		modelArchetype[2][5] = 1;
		
		modelArchetype[3][0] = 5;
		modelArchetype[3][3] = 8;
		modelArchetype[3][4] = 7;
		modelArchetype[3][6] = 9;
		modelArchetype[3][8] = 1;
		
		modelArchetype[4][2] = 9;
		modelArchetype[4][6] = 6;
		
		modelArchetype[5][0] = 4;
		modelArchetype[5][2] = 7;
		modelArchetype[5][4] = 6;
		modelArchetype[5][5] = 9;
		modelArchetype[5][8] = 8;
		
		modelArchetype[6][3] = 2;
		modelArchetype[6][6] = 8;
		modelArchetype[6][8] = 7;
		
		modelArchetype[7][4] = 8;
		modelArchetype[7][5] = 6;
		modelArchetype[7][6] = 4;
		modelArchetype[7][7] = 1;
		
		modelArchetype[8][2] = 8;
		modelArchetype[8][5] = 3;
		modelArchetype[8][8] = 2;
		return modelArchetype;
	}

}

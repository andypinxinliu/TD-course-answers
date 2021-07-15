package HW6;

import java.util.Arrays;

public class SudokuDriver {

	public static void main(String[] args) {
		int[][] grid1 = {
				{5,3,0,0,7,0,0,0,0},
				{6,0,0,1,9,5,0,0,0},
				{0,9,8,0,0,0,0,6,0},
				{8,0,0,0,6,0,0,0,3},
				{4,0,0,8,0,3,0,0,1},
				{7,0,0,0,2,0,0,0,6},
				{0,6,0,0,0,0,2,8,0},
				{0,0,0,4,1,9,0,0,5},
				{0,0,0,0,8,0,0,7,9}};
		Sudoku game1 = new Sudoku(grid1);
		game1.solve();
		int[][] solvedGrid = game1.getGrid();
		for(int i = 0; i < grid1.length; i ++) {
			System.out.println(Arrays.toString(solvedGrid[i]));
		}

	}

}

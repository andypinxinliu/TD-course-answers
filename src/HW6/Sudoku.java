package HW6;

public class Sudoku {
	/*
	 * 2D Array: Array of an Array
	 * 
	 * Matrix
	 *     0 1 2
	 * 0 {{1,2,3},
	 * 1  {2,3,4},
	 * 2  {4,0,6},
	 * 3  {7,8,9}};
	 *  
	 *  arr[0][1] ==>1
	 *  
	 *  arr[r][c]
	 * array: int[][] arr = {{1,2,3},{2,3,4},{4,5,6},{7,8,9}};
	 */
	private int[][] grid;
	
	public int[][] getGrid(){
		return grid;
	}
	public Sudoku() {
		grid = new int[9][9];
	}
	
	public Sudoku(int[][] grid) {	
		//need grid length to be a complete square
		this.grid = grid;
	}
	
	/*
	 * Assumption: if current is unfilled, use 0 to represent
	 */
	public boolean solve() {
		/*
		 * We need a starting point to solve
		 */
		//base case
		int row = -1; //row of unsolved value
		int col = -1; //column of unsolved value
		boolean isFull = true;
		for(int i = 0 ; i < grid.length; i ++) {
			for(int j = 0; j < grid[0].length; j ++) {
				if(grid[i][j] == 0) {
					isFull = false;
					row = i;
					col = j;
					break;
				}
			}
			if(!isFull) {
				break;
			}
		}
				
		//we also might have the solved grid
		if(isFull) {
			return true; // no space need to be solved
		}
		//we have the unsolved row and column, we need to solve this
		for(int num = 1; num <= 9; num ++) {
			//Step 1: ensure no rules are broken
			if(check(row, col, num)) {
				grid[row][col] = num;
				if(solve()) {
					return true;
				}else {
					grid[row][col] = 0;//cannot solve, use zero to represent
				}
			} else {
				continue;
			}
		}

		return false;
	
	}
	
	//check current num is ok in the current 
	private boolean check(int row, int col, int num) {
		/*
		 * 1. all rows need to be unique
		 * 2. all column need to be unique
		 * 3. all subgrid need to be unique
		 */
		
		//Rule 1
		for(int j = 0; j < grid[0].length; j ++) {
			if(grid[row][j] == num) {		
				return false;
			}
			
		}
		
		//Rule 2	
		for(int i = 0; i < grid.length; i ++) {
			if(grid[i][col] == num) {
				return false;
			}
		}
		
		//Rule 3
		int subgridSize = (int) Math.sqrt(grid.length);
		
		//Find subgrid starting point
		int rowStart = row - row % subgridSize;
		int colStart = col - col % subgridSize;
		
		for(int i = rowStart; i < rowStart + subgridSize; i ++) {
			for(int j = colStart; j < colStart + subgridSize; j ++) {
				if(grid[i][j] == num) {
					return false;
				}
			}
		}
		
		return true;

	}	
	
	
}

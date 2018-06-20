
public class MaxAreaOfIsland {
/**
 * Return the max value of the area formed by vertical or horizontal 1's
 * [[0,0,1,0,0,0,0,1,0,0,0,0,0],
	 [0,0,0,0,0,0,0,1,1,1,0,0,0],
	 [0,1,1,0,1,0,0,0,0,0,0,0,0],
	 [0,1,0,0,1,1,0,0,1,0,1,0,0],
	 [0,1,0,0,1,1,0,0,1,1,1,0,0],
	 [0,0,0,0,0,0,0,0,0,0,1,0,0],
	 [0,0,0,0,0,0,0,1,1,1,0,0,0],
	 [0,0,0,0,0,0,0,1,1,0,0,0,0]] Should return 6
	 
	 [[0,0,0,0,0,0,0,0]] Should return 0;
 */
	 public int maxAreaOfIsland(int[][] grid) {
	        int max = 0;
	        for(int i=0; i<grid.length; i++){
	            for(int j=0; j<grid[0].length; j++){
	                if(grid[i][j]==1)max = Math.max(max, Area(grid, i ,j));
	            }
	        }
	        return max;
	    }
	    
	    public int Area(int[][] grid, int i, int j){
	        if(i>=0 && i<grid.length && j>=0 && j<grid[0].length && grid[i][j] ==1){
	            grid[i][j] =0;
	            return 1 + Area(grid, i+1, j) + Area(grid, i, j+1) + Area(grid, i-1, j) + Area(grid, i, j-1);
	        }
	        return 0;
	    }
  /**
   * Using dfs to check every nearby elements of each element.
   */
}

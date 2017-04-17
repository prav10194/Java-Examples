public class TotalPathsInMaze
{
	private static int backtrack(int r, int c, int m, int n, int[][] mat) {
		if (r == m - 1 && c == n - 1)
			return 1;
		if (r >= m || c >= n)
			return 0;
		if (mat[r + 1][c] == -1)
			mat[r + 1][c] = backtrack(r + 1, c, m, n, mat);
		if (mat[r][c+1] == -1)
			mat[r][c + 1] = backtrack(r, c + 1, m, n, mat);
		
		return mat[r + 1][c] + mat[r][c + 1];
		}
	
	public static int uniquePathsWithObstacles(int[][] obstacleGrid) {
	    int width = obstacleGrid[0].length;
	    int[] dp = new int[width];
	    dp[0] = 1;
	    for (int[] row : obstacleGrid) {
	        for (int j = 0; j < width; j++) {
	            if (row[j] == 1)
	                dp[j] = 0;
	            else if (j > 0)
	                dp[j] += dp[j - 1];
	        }
	    }
	    return dp[width - 1];
	}
	
	
	public static void main(String args[])
	{
		int m=5; //total rows
		int n=5; //total columns
		int[][] mat = new int[m + 1][n + 1];
		for (int i = 0; i < m + 1; i++) {
			for (int j = 0; j < n + 1; j++) {
				mat[i][j] = -1;
				}
			}
		int[][] mat1={{0,0,0},{0,1,0},{0,0,0}}; //matrice with obstacles - 0 means no wall, 1 means a wall
		
		System.out.println("Number of Unique Paths - "+backtrack(0, 0, m, n, mat));
		System.out.println("Number of Unique Paths - "+uniquePathsWithObstacles(mat1));
	

		
	}
	
	
}

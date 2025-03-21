class Solution {
    public int uniquePaths(int m, int n) {
        int[] pathCounts = new int[n];
      
        Arrays.fill(pathCounts, 1);
        for (int row = 1; row < m; ++row) {
        
            for (int col = 1; col < n; ++col) {
               
                pathCounts[col] += pathCounts[col - 1];
            }
        }
      
        return pathCounts[n - 1];
    }
}
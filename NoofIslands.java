class Solution {
    public int numIslands(char[][] grid) {
        int co=0;
        int r=grid.length;
        int c=grid[0].length;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(grid[i][j]=='1'){
                    co++;
                dfs(grid, i, j);
                
    
                }
                
            }
        } 
        return co;
    }
    private void dfs(char[][] grid, int m, int n){
        int ro=grid.length;
        int co=grid[0].length;
        if(m<0 || m>=ro || n<0 || n>=co || grid[m][n] != '1'){
            return;
        }
        grid[m][n]='&';
        dfs(grid, m+1, n);
        dfs(grid, m-1, n);
        dfs(grid, m, n+1);
        dfs(grid, m, n-1);

    }
}

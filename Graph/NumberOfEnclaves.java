package Graph;

public class NumberOfEnclaves {
    public static void main(String[] args) {
        int[][] ar={{0,1,1,0},{0,0,1,0},{0,0,1,0},{0,0,0,0}};
        System.out.println(numEnclaves(ar));

    }
    public static int numEnclaves(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int[][] va=new int[m][n];
        int count=0;
        for(int i=0;i<m;i++){
            if(va[i][0]==0&&grid[i][0]==1){
                dfs(grid,i,0,va,m,n);
            }if(va[i][n-1]==0&&grid[i][n-1]==1){
                dfs(grid,i,n-1,va,m,n);
            }
        }
        for(int j=0;j<n;j++){
            if(va[0][j]==0&&grid[0][j]==1){
                dfs(grid,0,j,va,m,n);
            }if(va[m-1][j]==0&&grid[m-1][j]==1){
                dfs(grid,m-1,j,va,m,n);
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(va[i][j]==0&&grid[i][j]==1){
                    count++;
                }
            }
        }
        return count;
    }
    private static void dfs(int[][] grid, int row, int col, int[][] va, int m, int n){
        va[row][col]=1;
        int[] dx={-1,1,0,0};
        int[] dy={0,0,-1,1};
        for(int i=0;i<4;i++){
            int nrow=row+dx[i];
            int ncol=col+dy[i];
            if(nrow>=0&&ncol>=0&&ncol<n&&nrow<m&&va[nrow][ncol]==0&&grid[nrow][ncol]==1){
                dfs(grid,nrow,ncol,va,m,n);
            }
        }
    }
}

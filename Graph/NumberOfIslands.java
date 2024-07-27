package Graph;

public class NumberOfIslands {
    public static void main(String[] args) {
        NumberOfIslands solution = new NumberOfIslands();

        char[][] grid1 = {
                {'1', '1', '1', '1', '0'},
                {'1', '1', '0', '1', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '0', '0', '0'}
        };
        System.out.println(solution.numIslands(grid1)); // Output: 1

        char[][] grid2 = {
                {'1', '1', '0', '0', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '1', '0', '0'},
                {'0', '0', '0', '1', '1'}
        };
        System.out.println(solution.numIslands(grid2));
    }

    public int numIslands(char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        boolean[][] rc = new boolean[n][m];
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (!rc[i][j] && grid[i][j] == '1') {
                    cnt++;
                    nIL(rc, grid, i, j);
                }
            }

        }
        return cnt;
    }

    private void nIL(boolean[][] rc, char[][] grid, int i, int j) {
        int nr = grid.length;
        int nc = grid[0].length;

        if (i < 0 || j < 0 || i >= nr || j >= nc || grid[i][j] == '0' || rc[i][j]) {
            return;
        }
        rc[i][j] = true;
        nIL(rc, grid, i + 1, j);
        nIL(rc, grid, i - 1, j);
        nIL(rc, grid, i, j + 1);
        nIL(rc, grid, i, j - 1);
    }

}

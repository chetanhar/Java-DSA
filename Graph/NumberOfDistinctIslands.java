package Graph;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Objects;

class NumberOfDistinctIslands {

    public static void main(String[] args) {
        NumberOfDistinctIslands sol = new NumberOfDistinctIslands();
        int[][] grid = {
                {1, 1, 0, 0, 0},
                {1, 1, 0, 0, 0},
                {0, 0, 0, 1, 1},
                {0, 0, 0, 1, 1}
        };
        System.out.println(sol.countDistinctIslands(grid));  // Output: 1
    }

    public int countDistinctIslands(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int[][] va = new int[n][m];
        HashSet<ArrayList<Pair>> sa = new HashSet<>();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (va[i][j] == 0 && grid[i][j] == 1) {
                    ArrayList<Pair> ls = new ArrayList<>();
                    dfstraversal(i, j, grid, va, i, j, ls, n, m);
                    sa.add(ls);
                }
            }
        }
        return sa.size();
    }

    private void dfstraversal(int i, int j, int[][] grid, int[][] va, int i1, int j1, ArrayList<Pair> ls, int n, int m) {
        va[i][j] = 1;
        ls.add(new Pair(i - i1, j - j1));
        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};

        for (int k = 0; k < 4; k++) {
            int nrow = i + dx[k];
            int ncol = j + dy[k];
            if (nrow >= 0 && ncol >= 0 && nrow < n && ncol < m && grid[nrow][ncol] == 1 && va[nrow][ncol] == 0) {
                dfstraversal(nrow, ncol, grid, va, i1, j1, ls, n, m);
            }
        }
    }

    class Pair {
        int f;
        int s;

        public Pair(int f, int s) {
            this.f = f;
            this.s = s;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Pair pair = (Pair) o;
            return f == pair.f && s == pair.s;
        }

        @Override
        public int hashCode() {
            return Objects.hash(f, s);
        }
    }
}

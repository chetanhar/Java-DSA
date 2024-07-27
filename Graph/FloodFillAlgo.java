package Graph;

import java.util.LinkedList;
import java.util.Queue;

public class FloodFillAlgo {
    public static void main(String[] args)
    {
        int[][] image =  {
                {1,1,1},
                {1,1,0},
                {1,0,1}
        };

        // sr = 1, sc = 1, newColor = 2
        FloodFillAlgo obj = new FloodFillAlgo();
        int[][] ans = obj.floodFill(image, 1, 1, 2);
        for(int i = 0; i < ans.length; i++){
            for(int j = 0; j < ans[i].length; j++)
                System.out.print(ans[i][j] + " ");
            System.out.println();
        }
    }

    private int[][] floodFill(int[][] image, int sr, int sc, int colour) {
        int m=image.length;
        int n=image[0].length;
        int[] dx={0,0,1,-1};
        int[] dy={1,-1,0,0};
        int temp=image[sr][sc];
        Queue<int[]> queue=new LinkedList<>();
        queue.offer(new int[]{sr,sc});
        if(image[sr][sc]!=colour){
            image[sr][sc]=colour;
        }
        while (!queue.isEmpty()){
            int size=queue.size();
            for (int i = 0; i < size; i++) {
                int[] q= queue.poll();
                for (int j = 0; j < 4; j++) {
                    int x=q[0]+dx[j];
                    int y=q[1]+dy[j];
                    if(x<0||y<0||x>=m||y>=n||image[x][y]!=temp||image[x][y]==colour)continue;
                    image[x][y]=colour;
                    queue.offer(new int[]{x,y});
                }
            }

        }
        return image;
    }


}

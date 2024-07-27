package Graph;

import java.util.LinkedList;
import java.util.Queue;

public class RottenOranges {
    public static void main(String[] args) {
        int arr[][]={ {2,1,1} , {1,1,0} , {0,1,1} };
        int rotten=rottenOranges(arr);
        System.out.println(rotten);
    }

    private static int rottenOranges(int[][] arr) {
        int m= arr.length;;
        int n=arr[0].length;
        Queue<int[]> queue=new LinkedList<>();
        int count_fresh=0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(arr[i][j]==2){
                    queue.offer(new int[] {i,j});
                }
                if(arr[i][j]!=0){
                    count_fresh++;
                }
            }
        }
        if(count_fresh==0)return 0;
        int count_min=0,cnt=0;
        int[] dx={0,0,1,-1};
        int[] dy={1,-1,0,0};

        while (!queue.isEmpty()){
            int size=queue.size();
            cnt+=size;
            for (int i = 0; i < size; i++) {
                int[] po= queue.poll();
                for (int j = 0; j < 4; j++) {
                    int x=po[0]+dx[j];
                    int y=po[1]+dy[j];
                    if(x<0||y<0||x>=m||y>=n||arr[x][y]==0||arr[x][y]==2)continue;
                    arr[x][y]=2;
                    queue.offer(new int[]{x,y});
                }
            }
            if(queue.size()!=0){
                count_min++;
            }
        }
        return count_fresh==cnt?count_min:-1;
    }
}

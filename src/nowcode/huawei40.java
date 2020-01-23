package nowcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class huawei40 {
    static class XY{
        int X;
        int Y;
        XY(int x,int y){
            this.X=x;
            this.Y=y;
        }
    }

    public static void Path(List<XY> best){
        for (int i = 0; i <best.size() ; i++) {
            System.out.println("("+best.get(i).X+","+best.get(i).Y+")");
        }
    }

    public void findMin(int[][] maze, List<XY> now, List<XY> best, int i, int j){
        maze[i][j]=1;
        XY temp = new XY(i,j);
        now.add(temp);
        if(i==maze.length-1&&j==maze[0].length-1){
            if(best.isEmpty()||best.size()>now.size()){
                best= new ArrayList<>(now);
                Path(best);
            }
        }
        if(i+1<maze.length&&maze[i+1][j]==0){
            findMin(maze,now,best,i+1,j);
        }
        if(j+1<maze[0].length&&maze[i][j+1]==0){
            findMin(maze,now,best,i,j+1);
        }
        if(i-1>=0&&maze[i-1][j]==0){
            findMin(maze,now,best,i-1,j);
        }
        if(j-1>=0&&maze[i][j-1]==0){
            findMin(maze,now,best,i,j-1);
        }
        maze[i][j]=0;
        now.remove(temp);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n=sc.nextInt();
            int m=sc.nextInt();
            int[][] maze = new int[n][m];
            for (int i = 0; i <n ; i++) {
                for (int j = 0; j <m ; j++) {
                    maze[i][j]=sc.nextInt();
                }
            }
            List<XY> best = new LinkedList<>();
            List<XY> now = new LinkedList<>();
            huawei40 h = new huawei40();
            h.findMin(maze,now,best,0,0);

        }
    }
}

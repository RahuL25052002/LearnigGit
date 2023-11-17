package backTracking;

import java.util.ArrayList;
import java.util.Arrays;

public class countMaze{
    public static void main(String[] args) {
        /* 
        System.out.println(countMa(5, 5));
        countMazePrint("", 3, 3);
        System.out.println(pathRet("", 3, 3));*/
        boolean maze[][]={
            { true,true,true},
            {true,true,true},
            {true,true,true}
        };
        /* 
        countMazePrintRestrictions("", maze, 1,0);*/
        //allPath("", maze, 0, 0);
       int [][]path=new int[maze.length][maze[0].length];
       allPathprint("", maze, 0, 0, path, 1);
    }
    static int countMa(int r , int c){
        if(r==1 || c==1){
            return 1;
        }
        int right=countMa(r, c-1);
        int down=countMa(r-1, c);
        return right+down;
    }
    static void countMazePrint(String p,int r , int c){
        if(r==1 && c==1){
            System.out.println(p);
            return;
        }
        if(c>1)
            countMazePrint(p+'R',r, c-1);
        
        if(r>1)
            countMazePrint(p+'D',r-1, c);
    }
    static ArrayList<String> pathRet(String p,int r,int c){
        if(r==1 && c==1){
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> lis=new ArrayList<>();
        if(r>1 && c>1){
            lis.addAll(pathRet(p+'D', r-1, c-1));
        }
        if(r>1){
            lis.addAll(pathRet(p+'H', r-1, c));
        }
        if(c>1){
            lis.addAll(pathRet(p+'V', r, c-1));
        }
        return lis;
    }
    static void countMazePrintRestrictions(String p,boolean [][]maze,int r , int c){
        if(r==maze.length-1 && c==maze[0].length-1){
            System.out.println(p);
            return;
        }
        if(!maze[r][c]){
            return;
        }
        if(r<maze.length-1)
            countMazePrintRestrictions(p+'D', maze, r+1, c);
        
        if(c<maze[0].length-1){
            countMazePrintRestrictions(p+'R',maze,r, c+1);
        }
    }
    static void allPath(String p,boolean [][]maze,int r , int c){
        if(r==maze.length-1 && c==maze[0].length-1){
            System.out.println(p);
            return;
        }
        if(!maze[r][c])
            return;
        
        maze[r][c]=false;// visiting cell mark as false because of the not going in reverse in the same cell while that call
        if(r<maze.length-1)
            allPath(p+'D', maze, r+1, c);
        
        if(c<maze[0].length-1){
            allPath(p+'R',maze,r, c+1);
        }
        if(r>0){
            allPath(p+'U', maze, r-1, c);
        }
        if(c>0){
            allPath(p+'L', maze, r, c-1);
        }
        // simply here all i made changes in recursion that going to unchange or the revert the changes by then 
        // means i remove changes that i made in that recursive call by that last sentence in this so thats why i wrote 
        // this below line at last 
        maze[r][c]=true;
    }
     static void allPathprint(String p,boolean [][]maze,int r , int c,int[][]path,int step){
        if(r==maze.length-1 && c==maze[0].length-1){
            path[r][c]=step;
            for(int []arr:path){
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            System.out.println();
            return;
        }
        if(!maze[r][c])
            return;
        path[r][c]=step;
        maze[r][c]=false;// visiting cell mark as false because of the not going in reverse in the same cell while that call
        if(r<maze.length-1)
            allPathprint(p+'D', maze, r+1, c,path,step+1);
        
        if(c<maze[0].length-1){
            allPathprint(p+'R',maze,r, c+1,path,step+1);
        }
        if(r>0){
            allPathprint(p+'U', maze, r-1, c,path,step+1);
        }
        if(c>0){
            allPathprint(p+'L', maze, r, c-1,path,step+1);
        }
        // simply here all i made changes in recursion that going to unchange or the revert the changes by then 
        // means i remove changes that i made in that recursive call by that last sentence in this so thats why i wrote 
        // this below line at last 
        path[r][c]=0;
        maze[r][c]=true;
    }
}
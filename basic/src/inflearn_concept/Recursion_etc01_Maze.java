package inflearn_concept;

public class Recursion_etc01_Maze<pubic> {
    // Recursion의 응용 - 미로찾기

    /*
    boolean findPath(x,y)
        if(x,y) is the exit
            return true;
        else
            for each neighouring cell (x',y') of (x,y) do
                if(x',y') is on the pathway
                    if findPath(x', y')
                        return true;
           return false
     */

    private static int N = 8;
    private static int [][] maze= {
            {0,0,0,0,0,0,0,1},
            {0,1,1,0,1,1,0,1},
            {0,0,0,1,0,0,0,1},
            {0,1,0,0,1,1,0,0},
            {0,1,1,1,0,0,1,1},
            {0,1,0,0,0,1,0,1},
            {0,0,0,1,0,0,0,1},
            {0,1,1,1,0,1,0,0}
    };

    private static final int PATHWAY = 0;
    private static final int WALL = 1;
    private static final int BLOCKED =2; //visited이며 출구까지의 경로상에 있지 않음이 밝혀진 cell
    private static final int PATH =3; // visited이며 아직 출구로 가는 경로가 될 가능성이 있는 cell

    public static boolean findMazePath(int x, int y){
        if( x<0 || y<0 || x>=N || y>=N )
            return false;
        else if(maze[x][y] != PATHWAY)
            return false;
        else if(x==N-1 && y==N-1){
            maze[x][y] = PATH;
            return true;
        }
        else {
            maze[x][y] = PATH;
            if(findMazePath(x-1,y) || findMazePath(x,y+1) ||
               findMazePath(x+1, y) || findMazePath(x, y-1)){
                    return true;
            }
            maze[x][y] = BLOCKED; //dead end
            return false;
        }
    }
    public static void main (String [] args){
        //printMaze();
        findMazePath(0,0);
        //printMaze();
    }


    // 다시 해봐야함..

}

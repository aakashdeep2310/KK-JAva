import java.util.Arrays;

public class allPathMazeCount {
    

    public static void main(String[] args) {
        
         //maze with all the direction
         boolean[][] board  = {
            {true, true, true},
            {true, true, true},
            {true, true, true}

        };

        int[][] path = new int[board.length][board[0].length];
        allPathCount("", board, 0, 0, path, 1);

    }

    static void allPathCount(String p, boolean[][] maze, int r, int c, int[][] path, int step){ // p means processed answer
        if(r == maze.length-1 && c == maze[0].length-1){ // hitting the base case so print the path like: (DDRR, 1, 1)
            path[r][c] = step;
           for(int[] arr : path){
            System.out.println(Arrays.toString(arr));
           }
           System.out.println(p);
           System.out.println();
            return;
        }




        if(!maze[r][c]){ // same like if(maze[1][1] == false) then return
            return;
        }

        //i am considering this block in my path
        maze[r][c] = false; // while you move forward mark the current as false
        path[r][c] = step;
        if(r < maze.length-1){
            allPathCount(p + 'D', maze,  r+1, c, path, step+1);  // processed + D for downWard diredtion
        }
        if(c < maze[0].length-1){
            allPathCount(p + 'R', maze,  r, c+1, path, step+1); // processed + R for rightWard direction
        }
        if(r > 0){
            allPathCount(p + 'U', maze,  r-1, c, path, step+1); // processed + U for upWard direction
        }
        if(c > 0){
            allPathCount(p + 'L', maze,  r, c-1, path, step+1); // processed + L for leftWard direction
        }


        //this line where the function will over
        //  so before the function gets removed, also remove the changes that were made by that function

        maze[r][c] = true; // while moving back the recurion call make the current as true and then move
        path[r][c] = 0;

    }
}


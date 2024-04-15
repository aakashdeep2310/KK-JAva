public class allPathMaze {
    public static void main(String[] args) {
        
         //maze with all the direction
         boolean[][] board  = {
            {true, true, true},
            {true, true, true},
            {true, true, true}

        };

        allPath("", board, 0, 0);

    }

    static void allPath(String p, boolean[][] maze, int r, int c){ // p means processed answer
        if(r == maze.length-1 && c == maze[0].length-1){ // hitting the base case so print the path like: (DDRR, 1, 1)
            System.out.println(p);
            return;
        }




        if(!maze[r][c]){ // same like if(maze[1][1] == false) then return
            return;
        }

        //i am considering this block in my path
        maze[r][c] = false; // while you move forward mark the current as false
 
        if(r < maze.length-1){
            allPath(p + 'D', maze,  r+1, c);  // processed + D for downWard diredtion
        }
        if(c < maze[0].length-1){
            allPath(p + 'R', maze,  r, c+1); // processed + R for rightWard direction
        }
        if(r > 0){
            allPath(p + 'U', maze,  r-1, c); // processed + U for upWard direction
        }
        if(c > 0){
            allPath(p + 'L', maze,  r, c-1); // processed + L for leftWard direction
        }


        //this line where the function will over
        //  so before the function gets removed, also remove the changes that were made by that function

        maze[r][c] = true; // while moving back the recurion call make the current as true and then move
    }
}


/* from these path we can go from the start to end
    DDRR
    DDRURD
    DDRUURDD
    DRDR
    DRRD
    DRURDD
    RDDR
    RDRD
    RDLDRR
    RRDD
    RRDLDR
    RRDLLDRR
 */

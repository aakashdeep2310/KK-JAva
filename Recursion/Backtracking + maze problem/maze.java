import java.util.ArrayList;

        // | A |   |   |   // A means starting point in 3x3 matring and O means ending point
        // |---|---|---|
        // |   |   |   |
        // |---|---|---|
        // |   |   | O | 


public class maze {
    public static void main(String[] args) {
        // counting the path
        // System.out.println(mazeCount(3, 3));

        //counting the actual path
        // mazePath("", 3, 3);

        //Printing the path in ArrayList
        // ArrayList<String> ans = mazePathList("", 3, 3);
        // System.out.println(ans);

        //printing via diagonally
        // mazePathDiagonal("", 3, 3);

        //maze with the restriction 
        boolean[][] board  = {
            {true, true, true},
            {true, false, true},
            {true, true, true}

        };

        mazePathRestriction("", board, 0, 0);


    }
    //printing the count the number of the path
    static int mazeCount(int r, int c){
        if(r == 1 || c == 1){
            return 1;
        }

        int left = mazeCount(r-1, c);
        int right = mazeCount(r, c-1);
        return left + right;
    }

    //printing the actual path 
    static void mazePath(String p, int r, int c){ // p means processed answer
        if(r == 1 && c == 1){ // hitting the base case so print the path like: (DDRR, 1, 1)
            System.out.println(p);
            return;
        }
        if(r > 1){
            mazePath(p + 'D', r-1, c);  // processed + D for downWard diredtion
        }
        if(c > 1){
            mazePath(p + 'R', r, c-1); // processed + R for rightWard direction
        }
    }

    // printting the path in ArrayList
    static ArrayList<String> mazePathList(String p, int r, int c){ // p means processed answer
        if(r == 1 && c == 1){ // hitting the base case so print the path like: (DDRR, 1, 1)
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> ans = new ArrayList<>();
        if(r > 1){
            ans.addAll(mazePathList(p + 'D', r-1, c));  // processed + D for downWard diredtion
        }
        if(c > 1){
            ans.addAll(mazePathList(p + 'R', r, c-1)); // processed + R for rightWard direction
        }
        return ans;
    }


    static void mazePathDiagonal(String p, int r, int c){ // p means processed answer
        if(r == 1 && c == 1){ // hitting the base case so print the path like: (DDRR, 1, 1)
            System.out.println(p);
            return;
        }
        if(r > 1 && c > 1){
            mazePathDiagonal(p + 'D', r-1, c-1);  // processed + D for diagonal diredtion
        }
        if(r > 1){
            mazePathDiagonal(p + 'V', r-1, c);  // pr ocessed + D for downWard diredtion
        }
        if(c > 1){
            mazePathDiagonal(p + 'H', r, c-1); // processed + R for rightWard direction
        }
    }


    static void mazePathRestriction(String p, boolean[][] maze, int r, int c){ // p means processed answer
        if(r == maze.length-1 && c == maze[0].length-1){ // hitting the base case so print the path like: (DDRR, 1, 1)
            System.out.println(p);
            return;
        }

        if(!maze[r][c]){ // same like if(maze[1][1] == false) then return
            return;
        }

        if(r < maze.length-1){
            mazePathRestriction(p + 'D', maze,  r+1, c);  // processed + D for downWard diredtion
        }
        if(c < maze[0].length-1){
            mazePathRestriction(p + 'R', maze,  r, c+1); // processed + R for rightWard direction
        }
    }


   
}
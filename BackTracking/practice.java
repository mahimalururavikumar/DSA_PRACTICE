package BackTracking;

public class practice {
    public static Boolean isSafe(char board[][],int row,int col){

        for(int i=row-1;i>=0;i--){
            if(board[i][col] == 'Q'){
                return false;
            }
        }
        for(int i=row-1,j=col-1;i>=0 && j>=0;i--,j--){
            if(board[i][j] == 'Q'){
                return false;
            }
        }
        for(int i=row-1,j=col+1; i>=0 && j<board.length;i--,j++){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        return true;
    }

    public static boolean nQueens(char board[][],int row){
        if(row == board.length){
            System.out.println("------------chess board-------------------");
            printBorad(board);
            return true;
        }
        for(int j=0;j<board.length;j++){
            if(isSafe(board, row, j)){
                board[row][j] = 'Q';
                if(nQueens(board, row+1)){
                    return true;
                }
                board[row][j] = 'X';
            }
        }
        return false;
    }

    public static void printBorad(char board[][]){
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void subSets(String str,StringBuilder ans,int i){
        if( i == str.length()){
            if(ans.length() == 0){
                System.out.println("NULL");
            }else{
                System.out.println(ans);
            }
            return;
        }
        subSets(str, ans.append(str.charAt(i)), i+1);
        ans.deleteCharAt(ans.length()-1);
        subSets(str, ans, i+1);
    }
   
    public static void permutations(String str,String ans){
        if(str.length() == 0){
            System.out.println(ans);
            return;
        }
        for(int i=0;i<str.length();i++){
            char currChar = str.charAt(i);
            String newStr = str.substring(0, i)+str.substring(i+1);
            permutations(newStr, ans+currChar);
        }
    }

    public static int gridWays(int i,int j,int m,int n){
        //no of ways for a grid m-rows and n-cols
        //   (n-1+m-1)!/(n-1)!(m-1)!
        if(i == m-1 && j == n-1){
            return 1;
        }else if(i == m || j == n){
            return 0;
        }
        int w1 = gridWays(i+1, j, m, n);
        int w2 = gridWays(i, j+1, m, n);
        return w1 + w2;
    }

    //Sudoko Solver
    public static boolean isItSafe(int suduko[][],int row, int col, int digit){
        //column check
        for(int j=0;j<suduko.length;j++){
            if(suduko[row][j] == digit){
                return false;
            }
        }
        //row check
        for(int i=0;i<suduko.length;i++){
            if(suduko[i][col] == digit){
                return false;
            }
        }
        //grid check
        int sr = (row/3)*3;
        int sc = (col/3)*3;

        for(int i=sr;i<sr+3;i++){
            for(int j=sc;j<sc+3;j++){
                if(suduko[i][j] == digit){
                    return false;
                }
            }
        }
        return true;
    }
    public static boolean sudokoSolver(int suduko[][], int row, int col){

        if(row == suduko.length){
            return true;
        }

        int nextrow = row, nextcol = col + 1;
        
        if(col+1 == suduko.length){
            nextrow = row + 1;
            nextcol = 0;
        }
        if(suduko[row][col] != 0){
            return sudokoSolver(suduko, nextrow, nextcol);
        }
        for(int digit=1;digit<=9;digit++){
            if(isItSafe(suduko, row, col, digit)){
                suduko[row][col] = digit;
                if(sudokoSolver(suduko,nextrow,nextcol)){
                    return true;
                }
                suduko[row][col] = 0;
            }
        }
        return false;
    }
    public static void printSuduko(int suduko[][]){
        for(int i=0;i<suduko.length;i++){
            for(int j=0;j<suduko.length;j++){
                System.out.print(suduko[i][j]+" ");
            }
            System.out.println();
        }
    }
    
    
    public static void main(String args[]){
       
        //CHESS BOARD
        //{
        int n = 4;
        char board[][] = new char[n][n];
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                board[i][j] = 'X';
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
        // if(nQueens(board,0)){
        //     System.out.println("Solutions are possible");
        //     printBorad(board);
        // }else{
        //     System.out.println("Solutions are not possible");
        // }
        //}

        //SUDOKO SOLVER{
        //int suduko[][] = {{0, 0, 8, 0, 0, 0, 0, 0, 0},
        // {4, 9, 0, 1, 5, 7, 0, 0, 2},
        // {0, 0, 3, 0, 0, 4, 1, 9, 0},
        // {1, 8, 5, 0, 6, 0, 0, 2, 0},
        // {0, 0, 0, 0, 2, 0, 0, 6, 0},
        // {9, 6, 0, 4, 0, 5, 3, 0, 0},
        // {0, 3, 0, 0, 7, 2, 0, 0, 4},
        // {0, 4, 9, 0, 3, 0, 0, 5, 7},
        // {8, 2, 7, 0, 0, 9, 0, 1, 3} };
        // if(sudokoSolver(suduko, 0, 0)){
        //     System.out.println("Solution Exist");
        //     printSuduko(suduko);
        // }else{
        //     System.out.println("Solution does not exist");
        // }
        //}


    }
}

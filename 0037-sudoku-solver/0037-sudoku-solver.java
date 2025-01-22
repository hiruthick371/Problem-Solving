class Solution {
    public void solveSudoku(char[][] board) {

            solve(board);
        
        
    }
    private boolean solve(char[][]board){
         for(int i=0;i<9;++i){
            for(int j=0;j<9;++j){
                if(board[i][j]=='.'){
                for(char k ='1';k<='9';++k){
                    if(check(board,i,j,k)){
                        board[i][j] = k;
                        if(solve(board)) return true;
                        board[i][j] = '.';
                 
                    }
                }
                return false;
                }
            }
        }
        return true;
    }
    private static boolean check(char[][]board,int row,int col,char val){
        for(int i=0;i<9;++i){
            if(board[i][col]==val || board[row][i]==val) return false;
        }
        int startrow = (row/3)*3;
        int startcol = (col/3)*3;
        for(int i=startrow;i<startrow+3;++i){
            for(int j =startcol;j<startcol+3;++j){
                if(board[i][j]==val) return false;
            }
        }
        return true;
    }
}
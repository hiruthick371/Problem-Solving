class Solution {
    public int totalNQueens(int n) {
        char[][]board = new char[n][n];
        List<List<String>>list = new ArrayList<>();
        solve(0,list,board,n);
        return list.size();
        
    }
     private static void solve(int col,List<List<String>>list,char[][]board,int n){
        if(col==n){
            list.add(construct(board));
            return;
        }
        for(int row = 0;row<n;++row){
            if(isSafe(row,col,board,n)){
                board[row][col] = 'Q';
                solve(col+1,list,board,n);
                board[row][col] = '.';
            }
        }
    }
    private static boolean isSafe(int row,int col,char[][]board,int n){
        int duprow = row;
        int dupcol = col;
        while(col>=0 && row>=0){
            if(board[row][col]=='Q') return false;
            row--;
            col--;
        }
        row = duprow;
        col = dupcol;
        while(col>=0){
            if(board[row][col]=='Q') return false;
            col--;
        }
        col = dupcol;
        while(row<n && col>=0){
            if(board[row][col]=='Q') return false;
            row++;
            col--;
        }
        return true;
    }
    private static List<String> construct(char[][]board){
        List<String>list = new LinkedList<String>();
        for(int i=0;i<board.length;++i){
            String s = new String(board[i]);
            list.add(s);
        }
        return list;
    }
}
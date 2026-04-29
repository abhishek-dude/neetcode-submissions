class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i=0; i<9; i++){
            for(int j=0; j<9; j++){
                char ch=board[i][j];
                if(ch!='.'
                    && (!isUniqueInRow(ch, board, i)
                    || !isUniqueInColumn(ch,board, j)
                    || !isUniqueInBox(ch, board, i, j))){
                    return false;
                }
            }
        }        
        return true;
    }
    public boolean isUniqueInRow(char ch, char[][] board, int r){
        int c=0;
        for(int i=0; i<9; i++){
            if(ch==board[r][i])
            c++;
        }
        return c==1;
    }
    public boolean isUniqueInColumn(char ch, char[][] board, int col){
        int c=0;
        for(int i=0; i<9; i++){
            if(ch==board[i][col])
            c++;
        }
        return c==1;
    }
    public boolean isUniqueInBox(char ch, char[][] board, int r, int col){
        int sr=r-(r%3);
        int sc=col-(col%3);
        int c=0;
        for(int j=sr; j<sr+3; j++){
            for(int i=sc; i<sc+3; i++){
                if(ch==board[j][i])
                c++;
            }
        }
        return c==1;
    }
}

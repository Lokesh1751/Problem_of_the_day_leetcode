class Solution {
    public static boolean search(int i,int j,int idx,String word,char[][] board,boolean visited[][]){
if(idx==word.length()){
    return true;
}
        if(i<0 || j<0 || j>=board[0].length || i>=board.length || visited[i][j] || board[i][j]!=word.charAt(idx)){
            return false;
        }
    visited[i][j]=true;
    if(search(i+1,j,idx+1,word,board,visited) ||
    search(i-1,j,idx+1,word,board,visited) ||
    search(i,j+1,idx+1,word,board,visited) ||
    search(i,j-1,idx+1,word,board,visited)
    ){
        return true;
    }
    visited[i][j]=false;
    return false;
}
    public boolean exist(char[][] board, String word) {
        boolean visited[][]=new boolean[board.length][board[0].length];
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]==word.charAt(0) && search(i,j,0,word,board,visited)) return true;
            }
        }
        return false;
    }
}
//LEETCODE

public class Count_N_Queens {
    public static boolean isSafe(char chessBoard[][],int row, int col) {

        //vertically upward
        for (int i = row - 1; i >= 0; i--) {
            if (chessBoard[i][col] == 'Q') {
                return false;
            }
        }

        //diagonally left
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (chessBoard[i][j] == 'Q') {
                return false;
            }
        }

        //diagonally right
        for (int i = row - 1, j = col + 1; i >= 0 && j < chessBoard.length; i--, j++) {
            if (chessBoard[i][j] == 'Q') {
                return false;
            }
        }
        return true;
    }
    public static void placeQueens(char chessBoard[][], int row){
        //base
        if(row == chessBoard.length){
//            printBoard(chessBoard);
            count++;
            return;
        }
        //kaam
        for(int j=0; j<chessBoard.length; j++){
            if(isSafe(chessBoard,row,j)){
                chessBoard[row][j] = 'Q';
                placeQueens(chessBoard,row+1);
                chessBoard[row][j] = '*'; //backtracking work
            }
        }
    }

    public static int count = 0;
    public static void printBoard(char chessBoard[][]){
        System.out.println("--------Chess Board--------");
        for(int i=0; i<chessBoard.length; i++){
            for(int j=0; j<chessBoard.length; j++){
                System.out.print(chessBoard[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n = 4;

        char chessBoard[][] = new char[n][n];
        for(int i=0; i<chessBoard.length; i++){
            for(int j=0; j<chessBoard.length; j++){
                chessBoard[i][j] = '*';
            }
        }
        placeQueens(chessBoard,0);
    System.out.println("Total number of NQueens is "+count);


    }
}

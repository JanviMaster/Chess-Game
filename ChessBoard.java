public class ChessBoard {
    private Piece[][] board;

    public ChessBoard() {
        board = new Piece[8][8];
        setupBoard();
    }

    private void setupBoard() {
        // Initialize pieces on the board
        board[0][0] = new Rook("White");
        board[0][7] = new Rook("White");
        board[7][0] = new Rook("Black");
        board[7][7] = new Rook("Black");
        // Add other pieces...
    }

    public void displayBoard() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (board[i][j] != null) {
                    System.out.print(board[i][j].getSymbol() + " ");
                } else {
                    System.out.print(". ");
                }
            }
            System.out.println();
        }
    }
}

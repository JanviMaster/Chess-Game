import java.util.Scanner;

public class ChessGame {
    private ChessBoard board;
    private String currentPlayer;

    public ChessGame() {
        board = new ChessBoard();
        currentPlayer = "White";
    }

    public void play() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            board.displayBoard();
            System.out.println(currentPlayer + "'s Turn");
            System.out.print("Enter move (e.g., '0 0 0 5' to move piece at 0,0 to 0,5): ");
            
            int startX = scanner.nextInt();
            int startY = scanner.nextInt();
            int endX = scanner.nextInt();
            int endY = scanner.nextInt();

            // Move validation and execution (to be implemented)
            
            currentPlayer = currentPlayer.equals("White") ? "Black" : "White";
        }
    }

    public static void main(String[] args) {
        ChessGame game = new ChessGame();
        game.play();
    }
}

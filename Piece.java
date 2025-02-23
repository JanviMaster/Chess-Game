public abstract class Piece {
    protected String color;

    public Piece(String color) {
        this.color = color;
    }

    public abstract boolean isValidMove(int startX, int startY, int endX, int endY);
    public abstract String getSymbol();
}


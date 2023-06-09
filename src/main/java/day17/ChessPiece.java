package day17;

public enum ChessPiece {

    KING_WHITE(100, "♔"), QUEEN_WHITE(9, "♕"), ROOK_WHITE(5, "♖"),
    BISHOP_WHITE((35 / 10), "♗"), KNIGHT_WHITE(3, "♘"), PAWN_WHITE(1, "♙"),
    KING_BLACK(100, "♚"), QUEEN_BLACK(9, "♛"), ROOK_BLACK(5, "♜"),
    BISHOP_BLACK((35 / 10), "♝"), KNIGHT_BLACK(3, "♞"), PAWN_BLACK(1, "♟"),
    EMPTY(-1, "_");

    private int VALUE;
    private String DENOTATION;

    ChessPiece(int value, String denotation) {
        this.VALUE = value;
        this.DENOTATION = denotation;
    }

    @Override
    public String toString() {
        return DENOTATION;
    }
}


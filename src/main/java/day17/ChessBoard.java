package day17;

import java.util.Arrays;

public class ChessBoard {

    private ChessPiece[][] chessPieces;

    public ChessBoard(ChessPiece[][] chessPieces) {
        this.chessPieces = chessPieces;
    }

    @Override
    public String toString() {
        return "ChessBoard{" +
                "chess=" + Arrays.toString(chessPieces) +
                '}';
    }

    public static void print(ChessPiece[][] chessPiece) {
        for (int i = 0; i < chessPiece.length; i++) {
            System.out.println(Arrays.toString(chessPiece[i]).replaceAll("[\\,\\[\\]\\h]", ""));
        }
    }
}

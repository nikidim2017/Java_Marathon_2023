package day17;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {


        ChessPiece[][] chess = new ChessPiece[8][8];
        ChessBoard chessBoard = new ChessBoard(chess);

        for (int i = 0; i < chess.length; i++) {
            Arrays.fill(chess[i], ChessPiece.EMPTY);
     }
        chess[0][0] = ChessPiece.ROOK_BLACK;
        chess[0][5] = ChessPiece.ROOK_BLACK;
        chess[0][6] = ChessPiece.KING_BLACK;
        chess[1][1] = ChessPiece.ROOK_WHITE;
        chess[1][4] = ChessPiece.PAWN_BLACK;
        chess[1][5] = ChessPiece.PAWN_BLACK;
        chess[1][7] = ChessPiece.PAWN_BLACK;
        chess[2][0] = ChessPiece.PAWN_BLACK;
        chess[2][2] = ChessPiece.KNIGHT_BLACK;
        chess[2][6] = ChessPiece.PAWN_BLACK;
        chess[3][0] = ChessPiece.QUEEN_BLACK;
        chess[3][3] = ChessPiece.BISHOP_WHITE;
        chess[4][3] = ChessPiece.BISHOP_BLACK;
        chess[4][4] = ChessPiece.PAWN_WHITE;
        chess[4][5] = ChessPiece.BISHOP_WHITE;
        chess[5][4] = ChessPiece.PAWN_WHITE;
        chess[0][6] = ChessPiece.PAWN_WHITE;
        chess[6][3] = ChessPiece.QUEEN_WHITE;
        chess[6][5] = ChessPiece.PAWN_WHITE;
        chess[6][7] = ChessPiece.PAWN_WHITE;
        chess[7][5] = ChessPiece.ROOK_WHITE;
        chess[7][6] = ChessPiece.KING_WHITE;












        ChessBoard.print(chess);

    }
}
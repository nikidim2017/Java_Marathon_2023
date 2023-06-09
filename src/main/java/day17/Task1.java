package day17;

import com.sun.javafx.css.StyleCacheEntry;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {

        List<ChessPiece> chess = new ArrayList<>();

        int i = 0;
        while (i < 4) {
            chess.add(ChessPiece.PAWN_WHITE);
            i++;
        }
        int j = i;
        while (j < 8) {
            chess.add(ChessPiece.ROOK_BLACK);
            j++;
        }
        System.out.print(chess.toString().replaceAll("\\p{Punct}", "") + " ");
    }
}

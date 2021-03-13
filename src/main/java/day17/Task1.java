package day17;

public class Task1 {
    public static void main(String[] args) {

        ChessPiece[] chess = new ChessPiece[8];

        for (int i = 0; i < chess.length; i++) {
            if (i >= 4){
                chess[i] = ChessPiece.ROOK_BLACK; //ладья (англ. rook)
            }
            if (i < 4){
                chess[i] = ChessPiece.PAWN_WHITE; //пешка (англ. pawn)
            }
        }
        for (ChessPiece chessPiece : chess) {
            System.out.print(chessPiece + " ");
        }
    }
}
package day17;

public class ChessBoard {

    private ChessPiece[][] arraysChess;

    public ChessBoard(ChessPiece[][] arraysChess) {
        this.arraysChess = arraysChess;
    }

    public void print() {
        for (int i = 0; i < arraysChess.length; i++) {
            for (int j = 0; j < arraysChess[i].length; j++) {
                System.out.print(arraysChess[i][j]);
            }
            System.out.println();
        }
    }
}
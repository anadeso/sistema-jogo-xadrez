package chess;

import boardgame.Board;

public class ChessMatch {

    private Board board;

    public ChessMatch() {
         board = new Board(8, 8);
    }

    // Ele retorna uma matriz de pecas de xadrez correspondente a essa partida
    //
    // A classe Board tem as pecas do tipo Piece[][], mas retorna metodo ChessPiece
    // pq estou na camada de xadrez, para minha aplicacao nao quero liberar as pecas do
    // tipo Piece, mas sim do tipo ChessPiece.

    public ChessPiece[][] getPieces() {
        ChessPiece[][] mat = new ChessPiece[board.getRow()][board.getColumn()];

        // Percorrer a matriz de pecas do tabuleiro que é o board e para cada peca do meu
        // tabuleiro vou fazer um downcasting para ChessPiece
        for(int i=0; i<board.getRow(); i++) {
            for(int j=0; j<board.getColumn(); j++) {
                mat[i][j] = (ChessPiece) board.piece(i, j);
            }
        }
        return mat;
    }
}

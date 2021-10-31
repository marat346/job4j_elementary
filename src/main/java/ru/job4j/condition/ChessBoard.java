package ru.job4j.condition;

public class ChessBoard {
    public static int way(int x1, int y1, int x2, int y2) {
        int rsl = 0;
        if (x1 >= 0 && x2 >= 0 && y1 >= 0 && y2 >= 0 && x1 <= 7 && x2 <= 7 && y1 <= 7 && y2 <= 7 && Math.abs(x2 - x1) == Math.abs(y2 - y1)) {
            rsl = Math.abs(x2 - x1);

        }
        return rsl;
    }

    public static void main(String[] args) {
        int rook1 = ChessBoard.way(6, 7, 1, 2);
        int rook2 = ChessBoard.way(7, 0, 0, 7);
        int rook3 = ChessBoard.way(2, 6, 4, 1);
        int rook4 = ChessBoard.way(-1, 6, 4, 1);
        int rook5 = ChessBoard.way(2, -1, 4, 1);
        int rook6 = ChessBoard.way(2, 6, -1, 1);
        int rook7 = ChessBoard.way(2, 6, 4, -1);
        int rook8 = ChessBoard.way(10, 6, 4, 1);
        int rook9 = ChessBoard.way(2, 10, 4, 1);
        int rook10 = ChessBoard.way(2, 6, 10, 1);
        int rook11 = ChessBoard.way(2, 6, 4, 10);
        System.out.println(rook1);
        System.out.println(rook2);
        System.out.println(rook3);
        System.out.println(rook4);
        System.out.println(rook5);
        System.out.println(rook6);
        System.out.println(rook7);
        System.out.println(rook8);
        System.out.println(rook9);
        System.out.println(rook10);
        System.out.println(rook11);
        }
    }



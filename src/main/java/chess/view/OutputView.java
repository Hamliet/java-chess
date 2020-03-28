package chess.view;

import chess.domain.board.Board;
import chess.domain.board.Row;
import chess.domain.chesspiece.ChessPiece;
import chess.domain.game.Team;

import java.util.List;

public class OutputView {
    public static void printBoard(Board chessBoard) {
        List<Row> board = chessBoard.getBoard();

        System.out.println();
        for (int i = 8; i >= 1; i--) {
            printRow(i, board);
            System.out.println();
        }
    }

    private static void printRow(int index, List<Row> board) {
        for (int j = 0; j <= 7; j++) {
            Row row = board.get(index - 1);
            ChessPiece chessPiece = row.get(j);

            System.out.print(chessPiece.getName());
        }
    }

    public static void printInitialMessage() {
        System.out.println("> 체스 게임을 시작합니다.\n" +
                "> 게임 시작 : start\n" +
                "> 게임 종료 : end\n" +
                "> 게임 이동 : move source위치 target위치 - 예. move b2 b3");
    }

    public static void printWrongCommandMessage() {
        System.out.println("잘못된 커맨드입니다.");
    }

    public static void printWrongPositionMessage(Exception error) {
        System.out.println(error.getMessage());
    }

    public static void printScore(Board board) {
        Team nowPlayingTeam = board.getNowPlayingTeam();
        String nowPlayingTeamName = nowPlayingTeam.getTeamName();
        double nowPlayingTeamScore = board.getTotalScore();

        System.out.println("Score: " + nowPlayingTeamScore + " (" + nowPlayingTeamName + ")");
    }
}

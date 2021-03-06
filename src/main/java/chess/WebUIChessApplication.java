package chess;

import chess.controller.ChessGameController;

import static spark.Spark.*;

public class WebUIChessApplication {
    public static void main(String[] args) {
        staticFileLocation("/static");
        get("/", ChessGameController::index);
        post("/new_game", ChessGameController::newGame);
        post("/continue_game", ChessGameController::continueGame);
        post("/move", ChessGameController::move);
    }
}

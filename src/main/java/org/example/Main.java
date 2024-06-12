package org.example;

import org.example.TicTacToe.controllers.GameController;
import org.example.TicTacToe.exceptions.InvalidBotCountException;
import org.example.TicTacToe.exceptions.InvalidPlayerCountException;
import org.example.TicTacToe.models.*;
import org.example.TicTacToe.strategies.winningstrategies.ColWinningStrategy;
import org.example.TicTacToe.strategies.winningstrategies.DiagonalWinningStrategy;
import org.example.TicTacToe.strategies.winningstrategies.RowWinningStrategy;
import org.example.TicTacToe.strategies.winningstrategies.WinningStrategy;
import org.example.designpatterns.factory.components.button.WindowsButton;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws InvalidBotCountException, InvalidPlayerCountException {
        System.out.println("Hello world!");

        int dimension = 3;
        List<Player> players = new ArrayList<>();
        players.add(new Player("Sasi", new Symbol('X'), PlayerType.HUMAN));
        players.add(new Player("Krithi", new Symbol('O'), PlayerType.HUMAN));

        List<WinningStrategy> winningStrategies = List.of(
                new RowWinningStrategy(),
                new ColWinningStrategy(),
                new DiagonalWinningStrategy()
        );

        GameController gameController = new GameController();
        Game game = gameController.startGame(
                dimension,
                players,
                winningStrategies
        );

        while (game.getGameState().equals(GameState.IN_PROGRESS)) {
            //1. Print the board.
            //2. Ask user to choose where they want to make the move.
            gameController.printBoard(game);

            gameController.makeMove(game);
        }
    }
}
package org.example.TicTacToe.strategies.winningstrategies;

import org.example.TicTacToe.models.Board;
import org.example.TicTacToe.models.Move;
import org.example.TicTacToe.models.Player;

public class ColWinningStrategy implements WinningStrategy {
    @Override
    public boolean checkWinner(Board board, Move move) {
        return false;
    }
}

package org.example.TicTacToe.strategies.winningstrategies;

import org.example.TicTacToe.models.Board;
import org.example.TicTacToe.models.Move;
import org.example.TicTacToe.models.Player;

public interface WinningStrategy {
    boolean checkWinner(Board board, Move move);
}

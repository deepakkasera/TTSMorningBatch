package org.example.TicTacToe.strategies.botplayingstrategies;

import org.example.TicTacToe.models.Board;
import org.example.TicTacToe.models.Move;

public interface BotPlayingStrategy {
    Move makeMove(Board board);
}

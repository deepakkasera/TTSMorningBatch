package org.example.TicTacToe.strategies.winningstrategies;

import org.example.TicTacToe.models.Board;
import org.example.TicTacToe.models.Move;
import org.example.TicTacToe.models.Player;
import org.example.TicTacToe.models.Symbol;

import java.util.HashMap;
import java.util.Map;

public class DiagonalWinningStrategy implements WinningStrategy {
    private Map<Symbol, Integer> leftDiagonal = new HashMap<>();
    private Map<Symbol, Integer> rightDiagonal = new HashMap<>();

    @Override
    public boolean checkWinner(Board board, Move move) {
        int row = move.getCell().getRow();
        int col = move.getCell().getCol();
        Symbol symbol = move.getPlayer().getSymbol();

        //left Diagonal => row == col
        if (row == col) {
            if (!leftDiagonal.containsKey(symbol)) {
                leftDiagonal.put(symbol, 0);
            }

            leftDiagonal.put(symbol, leftDiagonal.get(symbol) + 1);

            return leftDiagonal.get(symbol).equals(board.getDimension());
        }

        //right Diagonal => row + col == dimension - 1
        if (row + col == board.getDimension() - 1) {
            if (!rightDiagonal.containsKey(symbol)) {
                rightDiagonal.put(symbol, 0);
            }

            rightDiagonal.put(symbol, rightDiagonal.get(symbol) + 1);

            return rightDiagonal.get(symbol).equals(board.getDimension());
        }

        return false;
    }
}

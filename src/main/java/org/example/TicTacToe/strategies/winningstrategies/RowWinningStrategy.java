package org.example.TicTacToe.strategies.winningstrategies;

import org.example.TicTacToe.models.Board;
import org.example.TicTacToe.models.Move;
import org.example.TicTacToe.models.Player;
import org.example.TicTacToe.models.Symbol;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RowWinningStrategy implements WinningStrategy {
    private Map<Integer, Map<Symbol, Integer>> rowCounts = new HashMap<>();

    @Override
    public boolean checkWinner(Board board, Move move) {
        int row = move.getCell().getRow();
        Symbol symbol= move.getPlayer().getSymbol();

        if (!rowCounts.containsKey(row)) {
            rowCounts.put(row, new HashMap<>());
        }

        Map<Symbol, Integer> rowMap = rowCounts.get(row);

        if (!rowMap.containsKey(symbol)) {
            rowMap.put(symbol, 0);
        }

        rowMap.put(symbol, rowMap.get(symbol) + 1);

       return rowMap.get(symbol).equals(board.getDimension());
    }
}

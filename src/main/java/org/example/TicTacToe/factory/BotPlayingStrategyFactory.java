package org.example.TicTacToe.factory;

import org.example.TicTacToe.models.BotDifficultyLevel;
import org.example.TicTacToe.strategies.botplayingstrategies.BotPlayingStrategy;
import org.example.TicTacToe.strategies.botplayingstrategies.EasyBotPlayingStrategy;
import org.example.TicTacToe.strategies.botplayingstrategies.HardBotPlayingStrategy;
import org.example.TicTacToe.strategies.botplayingstrategies.MediumBotPlayingStrategy;

public class BotPlayingStrategyFactory {
    public static BotPlayingStrategy getBotPlayingStrategy(BotDifficultyLevel difficultyLevel) {
        if (difficultyLevel.equals(BotDifficultyLevel.EASY)) {
            return new EasyBotPlayingStrategy();
        } else if (difficultyLevel.equals(BotDifficultyLevel.MEDIUM)) {
            return new MediumBotPlayingStrategy();
        } else if (difficultyLevel.equals(BotDifficultyLevel.HARD)) {
            return new HardBotPlayingStrategy();
        }

        return null;
    }
}

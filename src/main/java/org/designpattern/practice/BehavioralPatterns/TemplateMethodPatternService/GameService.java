package org.designpattern.practice.BehavioralPatterns.TemplateMethodPatternService;

public class GameService {
    public void playGame(String gameType) {
        Game game = null;

        if (gameType.equals("Cricket")) {
            game = new CricketGame();
        } else if (gameType.equals("Football")) {
            game = new FootballGame();
        }

        if (game != null) {
            game.play();  // Call the template method
        }
    }
}

abstract class Game {
    abstract void initialize();  // Step 1: Initialize game
    abstract void startPlay();   // Step 2: Start play
    abstract void endPlay();     // Step 3: End play

    // Template method defines the skeleton of the algorithm
    public final void play() {
        initialize();  // Step 1
        startPlay();   // Step 2
        endPlay();     // Step 3
    }
}

class CricketGame extends Game {
    public void initialize() {
        System.out.println("Cricket Game Initialized.");
    }

    public void startPlay() {
        System.out.println("Cricket Game Started.");
    }

    public void endPlay() {
        System.out.println("Cricket Game Ended.");
    }
}

class FootballGame extends Game {
    public void initialize() {
        System.out.println("Football Game Initialized.");
    }

    public void startPlay() {
        System.out.println("Football Game Started.");
    }

    public void endPlay() {
        System.out.println("Football Game Ended.");
    }
}

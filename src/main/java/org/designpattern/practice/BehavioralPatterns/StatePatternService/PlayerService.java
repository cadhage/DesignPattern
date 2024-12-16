package org.designpattern.practice.BehavioralPatterns.StatePatternService;

public class PlayerService {
    private PlayerState currentState;

    public PlayerService() {
        currentState = new StoppedState();  // Default state
    }

    public void play(String action) {
        if (action.equals("Start")) {
            currentState = new PlayingState();  // Change to Playing state
        } else if (action.equals("Stop")) {
            currentState = new StoppedState();  // Change to Stopped state
        }

        currentState.doAction();  // Perform action based on the current state
    }
}

interface PlayerState {
    void doAction();
}

class PlayingState implements PlayerState {
    public void doAction() {
        System.out.println("Player is Playing.");
    }
}

class StoppedState implements PlayerState {
    public void doAction() {
        System.out.println("Player is Stopped.");
    }
}

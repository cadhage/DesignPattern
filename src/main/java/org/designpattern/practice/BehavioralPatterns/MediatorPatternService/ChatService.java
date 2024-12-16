package org.designpattern.practice.BehavioralPatterns.MediatorPatternService;

public class ChatService {
    private ChatMediator mediator;

    public ChatService() {
        mediator = new ChatMediator();
    }

    public void chat(String userName, String message) {
        mediator.sendMessage(userName, message);  // Mediator handles user communication
    }
}

class ChatMediator {
    public void sendMessage(String userName, String message) {
        System.out.println(userName + " says: " + message);  // Mediator forwards the message
    }
}

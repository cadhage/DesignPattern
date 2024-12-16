package org.designpattern.practice.CreationalPatterns.FactoryPatternService;

public class NotificationService {
    public void sendNotification(String type) {
        // Use the factory to create the appropriate notification object based on input type
        Notification notification = NotificationFactory.createNotification(type);
        notification.send();
    }
}

interface Notification {
    void send();  // Define a send method to be implemented by all notification types
}

class SMSNotification implements Notification {
    public void send() {
        System.out.println("Sending SMS Notification");
    }
}

class EmailNotification implements Notification {
    public void send() {
        System.out.println("Sending Email Notification");
    }
}

// The factory class creates an instance based on type input (SMS, Email, etc.)
class NotificationFactory {
    public static Notification createNotification(String type) {
        if (type.equals("SMS")) {
            return new SMSNotification();  // Creates and returns an SMS Notification
        } else if (type.equals("Email")) {
            return new EmailNotification();  // Creates and returns an Email Notification
        }
        return null;  // Returns null if type is unknown
    }
}

package org.designpattern.practice.BehavioralPatterns.ChainofResponsibilityPatternService;

public class LoggerService {
    private static Logger infoLogger;
    private static Logger errorLogger;

    public static final int INFO = 1;
    public static final int ERROR = 2;

    public LoggerService() {
        infoLogger = new InfoLogger();
        errorLogger = new ErrorLogger();

        // Set the next handler in the chain
        infoLogger.setNextLogger(errorLogger);  // InfoLogger will forward to ErrorLogger if it cannot handle the request
    }

    public void logMessage(int level, String message) {
        if (level == INFO) {
            infoLogger.logMessage(message);  // Starts the chain with InfoLogger
        } else if (level == ERROR) {
            errorLogger.logMessage(message);  // Starts the chain with ErrorLogger
        }
    }
}

abstract class Logger {
    protected int level;
    protected Logger nextLogger;

    public void setNextLogger(Logger nextLogger) {
        this.nextLogger = nextLogger;  // Set the next handler in the chain
    }

    public void logMessage(String message) {
        if (this.level <= level) {
            write(message);  // If this logger can handle the request, it writes the message
        }
        if (nextLogger != null) {
            nextLogger.logMessage(message);  // Otherwise, it passes the request along the chain
        }
    }

    abstract protected void write(String message);  // Abstract method to write the log
}

class InfoLogger extends Logger {
    public InfoLogger() {
        level = INFO;
    }

    protected void write(String message) {
        System.out.println("Info Log: " + message);
    }
}

class ErrorLogger extends Logger {
    public ErrorLogger() {
        level = ERROR;
    }

    protected void write(String message) {
        System.out.println("Error Log: " + message);
    }
}

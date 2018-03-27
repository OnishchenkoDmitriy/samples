package sample_1.logger;

import sample_1.event.Event;

public class ConsoleEventLogger implements EventLogger {

    public void logEvent(String message){
        System.out.println(message);
    }
}

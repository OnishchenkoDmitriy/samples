package sample_1.logger;

import sample_1.event.Event;

import java.util.List;

public class CombinedEventLogger implements EventLogger {

    List<EventLogger> loggers;

    public CombinedEventLogger(List<EventLogger> loggers) {
        this.loggers = loggers;
    }

    @Override
    public void logEvent(String message) {
        loggers.forEach(logger -> logger.logEvent(message));
    }
}

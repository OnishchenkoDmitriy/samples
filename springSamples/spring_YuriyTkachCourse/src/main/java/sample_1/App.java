package sample_1;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import sample_1.event.Event;
import sample_1.event.EventType;
import sample_1.logger.EventLogger;

import java.util.Map;

public class App {

    Client client;
    EventLogger defaultLogger;
    Map<EventType, EventLogger> loggers;

    public App(Client client, EventLogger defaultLogger, Map<EventType, EventLogger> loggers) {
        this.client = client;
        this.defaultLogger = defaultLogger;
        this.loggers = loggers;
    }

    public App() {
    }

    public void logEvent(EventType eventType, String message){
        EventLogger eventLogger = loggers.get(eventType);
        if(eventLogger == null){
            eventLogger = defaultLogger;
        }
        eventLogger.logEvent(message);
    }

    public static void main(String[] args) {

        ConfigurableApplicationContext applicationContext = new ClassPathXmlApplicationContext("context.xml");

        App app = (App) applicationContext.getBean("app");
        Event event = (Event) applicationContext.getBean("event");
        event.setMessage("Some cache message");
        app.logEvent(EventType.ERROR ,event.getMessage());

        applicationContext.close();

    }
}

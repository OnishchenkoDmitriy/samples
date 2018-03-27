package sample_1.event;

import java.text.DateFormat;
import java.util.Date;

public class Event {

    private int id;
    private String message;
    private Date date;
    private DateFormat dateFormat;

    public Event(Date date, DateFormat dateFormat) {
        this.date = date;
        this.dateFormat = dateFormat;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return "Event{" +
                "id=" + id +
                ", message='" + message + '\'' +
                ", date=" + date +
                ", dateFormat=" + dateFormat +
                '}';
    }
}

package sample_1.logger;

import sample_1.event.Event;

import java.util.ArrayList;
import java.util.List;

public class CacheFileLogger extends FileEventLogger {

    private int cacheSize;
    private List<Event> cache;

    public CacheFileLogger(String fileName, int cacheSize) {
        super(fileName);
        this.cacheSize = cacheSize;
        cache = new ArrayList<>();
    }

    public void logEvent(Event event){
        cache.add(event);
        if(cache.size() == cacheSize){
            writeEventsFromCache();
            cache.clear();
        }
    }

    private void writeEventsFromCache() {
        cache.forEach(this::logEvent);
    }

    private void destroy(){
        if(!cache.isEmpty()){
            writeEventsFromCache();
        }
    }


}

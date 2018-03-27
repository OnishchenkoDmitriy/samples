package sample_1.logger;

import org.apache.commons.io.FileUtils;
import sample_1.event.Event;

import java.io.File;
import java.io.IOException;

public class FileEventLogger implements EventLogger {

    private String fileName;
    private File file;

    public FileEventLogger(String fileName) {
        this.fileName = fileName;
    }

    public void logEvent(String message) {
        try {
            FileUtils.writeStringToFile(file, message + "\n", true);
            System.out.println("Append to file " + fileName);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private void init() throws IOException {
        this.file = new File(fileName);
        if(!file.canWrite()){
            throw new IOException();
        }
    }

}

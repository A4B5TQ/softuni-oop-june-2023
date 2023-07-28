package patterns.command;

import java.nio.file.Path;

public class ImageFileReceiver {

    private String name;
    private Path path;

    public ImageFileReceiver(String name) {
        this.name = name;
    }

    public void open() {

    }

    public void close() {

    }

    public String getName() {
        return name;
    }
}

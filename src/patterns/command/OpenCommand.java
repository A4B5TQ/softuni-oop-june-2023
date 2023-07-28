package patterns.command;

public class OpenCommand implements ImageFileOperation {

    private ImageFileReceiver imageFileReceiver;

    public OpenCommand(ImageFileReceiver imageFileReceiver) {
        this.imageFileReceiver = imageFileReceiver;
    }

    @Override
    public String execute() {
        this.imageFileReceiver.open();
        return "Open file: " + this.imageFileReceiver.getName();
    }
}

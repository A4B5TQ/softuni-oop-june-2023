package patterns.command;

public class CloseCommand implements ImageFileOperation {

    private ImageFileReceiver imageFileReceiver;

    public CloseCommand(ImageFileReceiver imageFileReceiver) {
        this.imageFileReceiver = imageFileReceiver;
    }


    @Override
    public String execute() {
        this.imageFileReceiver.close();
        return "Close file: " + this.imageFileReceiver.getName();
    }
}

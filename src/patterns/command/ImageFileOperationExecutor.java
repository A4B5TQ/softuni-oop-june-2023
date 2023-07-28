package patterns.command;

public class ImageFileOperationExecutor {

//    private final List<ImageFileOperation> imageFileOperations;

//    public ImageFileOperationExecutor() {
//        this.imageFileOperations = new ArrayList<>();
//    }

    public String executeOperation(ImageFileOperation imageFileOperation) {
//       this.imageFileOperations.add(imageFileOperation);
       return imageFileOperation.execute();
   }
}

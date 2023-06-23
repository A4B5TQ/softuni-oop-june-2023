package workingWithAbstraction.studentSystem;

public class CreateCommand {

    private StudentSystem studentSystem;

    public CreateCommand(StudentSystem studentSystem) {
        this.studentSystem = studentSystem;
    }

    public void execute(String[] args) {
        var name = args[0];
        var age = Integer.parseInt(args[1]);
        var grade = Double.parseDouble(args[2]);
        if (!this.studentSystem.getRepo().containsKey(name)) {
            var student = new Student(name, age, grade);
            this.studentSystem.getRepo().put(name, student);
        }
    }
}

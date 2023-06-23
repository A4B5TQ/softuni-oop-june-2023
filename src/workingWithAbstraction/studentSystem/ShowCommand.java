package workingWithAbstraction.studentSystem;

public class ShowCommand {

    public StudentSystem studentSystem;

    public ShowCommand(StudentSystem studentSystem) {
        this.studentSystem = studentSystem;
    }

    public void execute(String name) {
        if (this.studentSystem.getRepo().containsKey(name)) {
            var student = this.studentSystem.getRepo().get(name);
            System.out.println(student);
        }
    }
}

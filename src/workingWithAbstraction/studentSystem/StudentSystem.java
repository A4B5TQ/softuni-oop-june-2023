package workingWithAbstraction.studentSystem;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class StudentSystem {

    private final static String CREATE_COMMAND_NAME = "Create";
    private final static String SHOW_COMMAND_NAME = "Show";
    private Map<String, Student> repo;

    public StudentSystem() {
        this.repo = new HashMap<>();
    }

    public Map<String, Student> getRepo() {
        return this.repo;
    }

    public void parseCommand(String[] args) {
        if (CREATE_COMMAND_NAME.equals(args[0])) {
            CreateCommand createCommand = new CreateCommand(this);
            createCommand.execute(Arrays.stream(args).skip(1).toArray(String[]::new));
        } else if (SHOW_COMMAND_NAME.equals(args[0])) {
            ShowCommand showCommand = new ShowCommand(this);
            showCommand.execute(args[1]);
        }
    }
}

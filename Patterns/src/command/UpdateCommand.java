package command;

/**
 * Created by daniel on 30/11/16.
 */
public class UpdateCommand implements Command {
    Database database;

    public UpdateCommand(Database database) {
        this.database = database;
    }

    @Override
    public void execute() {
        database.update();

    }
}

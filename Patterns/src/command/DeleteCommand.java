package command;

/**
 * Created by daniel on 30/11/16.
 */
public class DeleteCommand implements Command {
    Database database;

    public DeleteCommand(Database database) {
        this.database = database;
    }

    @Override
    public void execute() {
        database.delete();

    }
}

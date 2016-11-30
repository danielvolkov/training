package command;

/**
 * Created by daniel on 30/11/16.
 */
public class SelectCommand implements Command {
    Database database;

    public SelectCommand(Database database) {
        this.database = database;
    }

    @Override
    public void execute() {
        database.select();

    }
}

package adapter;

/**
 * Created by daniel on 28/11/16.
 */
public class DatabaseRunner {
    public static void main(String[] args) {
        Database database = new AdapterJavaToDatabase();
        database.insert();
        database.update();
        database.select();
        database.remove();
    }
}

import model.Model;

/**
 * Main class
 * Created by daniel.volkov on 05/11/16.
 */
public class Main {
    public static void main(String[] args) {
        Model model = new Model();
        View view = new View();
        Controller controller = new Controller(model,view);
        controller.processUser();
    }
}

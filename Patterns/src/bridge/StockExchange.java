package bridge;

/**
 * Created by daniel on 28/11/16.
 */
public class StockExchange extends Program {
    protected StockExchange(Developer developer) {
        super(developer);
    }

    @Override
    public void developProgram() {
        System.out.println("stock exchange development in progress...");
        developer.writeCode();
    }
}

package bridge;

/**
 * Created by daniel on 28/11/16.
 */
public class BankSystem extends Program {
    protected BankSystem(Developer developer) {
        super(developer);
    }

    @Override
    public void developProgram() {
        System.out.println("bank system is developing..");
        developer.writeCode();
    }

}

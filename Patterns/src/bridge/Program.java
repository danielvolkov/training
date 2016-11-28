package bridge;



/**
 * Created by daniel on 28/11/16.
 */
public abstract class Program {
    protected Developer developer;

    protected Program(Developer developer){
        this.developer =developer;
    }

    public abstract void developProgram();
}

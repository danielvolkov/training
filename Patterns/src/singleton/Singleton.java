package singleton;

import javax.print.DocFlavor;
import java.io.InputStream;

/**
 * Created by daniel on 21/11/16.
 *
 * Singleton
 *
 * Goal:
 *  Creates only one instance of class
 */
public class Singleton {
    private static volatile Singleton singleton;

    private Singleton(){
    }

    public static Singleton getInstance() {
        Singleton localInstance = singleton;
        if (localInstance == null) {
            synchronized (Singleton.class) {
                localInstance = singleton;
                if (localInstance == null) {
                    singleton = localInstance = new Singleton();
                }
            }
        }
        return localInstance;
    }


}

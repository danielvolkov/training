package main;

import kitchen.Chief;
import kitchen.GlobConst;

/**
 * Main class
 * Created by daniel.volkov on 13/11/16.
 * @author daniel.volkov
 */
public class Main {

    public static void main(String[] args) {
        Chief chief = new Chief(GlobConst.CHIEF_NAME);
        chief.cook();
    }
}

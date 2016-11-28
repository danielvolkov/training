package singleton.lazyloaded;

/**
 * Created by daniel on 23/11/16.
 */
public class LazyLoaded {
    private LazyLoaded() {}

    private static class LazyHolder {
        private static final LazyLoaded INSTANCE = new LazyLoaded();
    }

    public static LazyLoaded getInstance() {
        return LazyHolder.INSTANCE;
    }
}


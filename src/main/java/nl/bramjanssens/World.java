package nl.bramjanssens;

import java.lang.reflect.InvocationTargetException;

public enum World {

    instance;

    public static World turn() {
        return instance;
    }

    public <T> T a(Class<T> c) {
        try {
            return c.getDeclaredConstructor().newInstance();
        } catch (InstantiationException | IllegalAccessException | InvocationTargetException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
}

package nl.bramjanssens;

import java.lang.reflect.InvocationTargetException;
import java.util.Random;
import java.util.Stack;

public class Box<T> {

    private static final Random RANDOM = new Random();
    private final Class<T> type;
    private final Stack<T> contents = new Stack<>();
    private final int size;

    public Box() {
        this(null, 0);
    }

    private Box(Class<T> clazz, int size) {
        this.type = clazz;
        this.size = size;
    }

    public static <V> Box<V> of(int size, Class<V> clazz) {
        return new Box<>(clazz, size);
    }

    public <V> Life<Box<V>> of(Class<V> c) {
        System.out.println("You never know what you're gonna get.");
        return new Life<>();
    }

    public void refill() {
        this.contents.clear();
        fillWith(this.size);
    }

    @SuppressWarnings("unchecked")
    private void fillWith(int size) {
        Class<T>[] permittedSubclasses = (Class<T>[]) type.getPermittedSubclasses();
        int numberOfPermittedSubclasses = permittedSubclasses.length;
        for (int i = 0; i < size; i++) {
            try {
                Class<T> permittedSubclass = permittedSubclasses[RANDOM.nextInt(numberOfPermittedSubclasses)];
                contents.push(permittedSubclass.getDeclaredConstructor().newInstance());
            } catch (InstantiationException | IllegalAccessException | InvocationTargetException | NoSuchMethodException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public T get() {
        if (contents.empty()) refill();
        return contents.pop();
    }
}

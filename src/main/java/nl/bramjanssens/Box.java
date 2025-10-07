package nl.bramjanssens;

public class Box<T> {

    public <V> Life<Box<V>> of(Class<V> c) {
        return new Life<>();
    }
}

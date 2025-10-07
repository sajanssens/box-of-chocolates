package nl.bramjanssens;

public sealed class Chocolate {
    public static final class Praline extends Chocolate { }

    public static final class Mars extends Chocolate { }

    @Override
    public String toString() { return getClass().getSimpleName(); }
}

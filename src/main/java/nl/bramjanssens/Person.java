package nl.bramjanssens;

public class Person {
    private String name;

    public void called(Person p, String name) {
        p.name = name;
    }

    public void run() {
        System.out.println(Quotes.random());
    }
}

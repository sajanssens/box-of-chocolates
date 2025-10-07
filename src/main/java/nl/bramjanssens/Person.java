package nl.bramjanssens;

public class Person {
    private String name;

    public void called(Person p, String name) {
        p.name = name;
    }

    public void run() {
        System.out.println(Quotes.random());
    }

    public void eatOneFromA(Chocolate[] arrayOfChocolates) {
        Chocolate chocolate = arrayOfChocolates[0];
        System.out.printf("Forrest got a %-15s Burp...!%n", chocolate + ".");

        // refill with some chocolates...
        // arrayOfChocolates[0] = new Chocolate();
        // arrayOfChocolates[1] = new Chocolate.Praline();
        // arrayOfChocolates[2] = new Chocolate.Mars();
    }

    public void eatOneFromA(Box<Chocolate> boxOfChocolates) {
        Chocolate chocolate = boxOfChocolates.get();
        System.out.printf("Forrest got a %-15s Yummie..!%n", chocolate + ".");
    }

    public Chocolate pickOneFrom(Box<Chocolate> boxOfChocolates) {
        return boxOfChocolates.get();
    }

    public void inspectA(Chocolate chocolate) {
        System.out.println("Forrest sees a " + chocolate + ".");
    }
}

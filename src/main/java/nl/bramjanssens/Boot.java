package nl.bramjanssens;

import nl.bramjanssens.Chocolate.Mars;
import nl.bramjanssens.Chocolate.Praline;

@SuppressWarnings("unchecked") public class Boot {

    private Life<Box<Chocolate>> life;

    private final World like = World.turn();
    private final Class<Box> box = Box.class;
    private final Class<Chocolate> chocolates = Chocolate.class;
    private final Class<Person> person = Person.class;
    private final Person Forrest = new Person();
    private final String Gump = "Gump";

    Chocolate chocolate = new Chocolate();
    Praline praline = new Praline();
    Mars mars = new Mars();

    Box<Chocolate> boxOfChocolates = Box.of(20, chocolates);
    Box<Praline> boxOfPralines = Box.of(30, Praline.class);
    Box<Mars> boxOfMarses = Box.of(10, Mars.class);

    Chocolate[] arrayOfChocolates = new Chocolate[]{chocolate};
    Praline[] arrayOfPralines = new Praline[]{praline};
    Mars[] arrayOfMarses = new Mars[]{mars};

    void main() {
        System.out.println("Generics...");
        life = like.a(box).of(chocolates);
        life.create.a(person).called(Forrest, Gump);
        run(Forrest);

        Forrest.inspectA(chocolate);
        Forrest.inspectA(praline);
        Forrest.inspectA(mars);

        Forrest.eatOneFromA(arrayOfChocolates);
        Forrest.eatOneFromA(arrayOfPralines);
        Forrest.eatOneFromA(arrayOfMarses);

        // Forrest.eatOneFromA(boxOfChocolates);
        // Forrest.eatOneFromA(boxOfPralines);
        // Forrest.eatOneFromA(boxOfMarses);
    }

    private void run(Person p) {
        p.run();
    }
}

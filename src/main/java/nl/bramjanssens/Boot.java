package nl.bramjanssens;

@SuppressWarnings("unchecked")
public class Boot {

    private Life<Box<Chocolate>> life;

    private final World like = World.turn();
    private final Class<Box> box = Box.class;
    private final Class<Chocolate> chocolates = Chocolate.class;
    private final Class<Person> person = Person.class;
    private final Person Forrest = new Person();
    private final String Gump = "Gump";

    void main() {
        life = like.a(box).of(chocolates);
        life.created.a(person).called(Forrest, Gump);
        run(Forrest);
    }

    private void run(Person p) {
        p.run();
    }
}

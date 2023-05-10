package polimorfizm.polimorfizmdziedziczenie;

public class Giraffe extends Animal {
    public String name;
    public static final String MEAL_DEFAULT = " je paszę";
    public static final String TYPE_DEFAULT = "Żyrafa ";

    public Giraffe(String name) {
        super(TYPE_DEFAULT + name, MEAL_DEFAULT);
    }
}

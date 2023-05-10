package polimorfizm.polimorfizmdziedziczenie;

public class Shark extends Animal {
    public String name = "";
    public static final String MEAL_DEFAULT = " je tuńczyka";
    public static final String TYPE_DEFAULT = "Rekin ";

    public Shark(String name) {
        super(TYPE_DEFAULT + name, MEAL_DEFAULT);
    }
}

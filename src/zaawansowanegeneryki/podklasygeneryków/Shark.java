package zaawansowanegeneryki.podklasygeneryków;

public class Shark extends Animal {
    public static final String MEAL_DEFAULT = "tuńczyka";
    public static final String TYPE_DEFAULT = "Rekin";

    public Shark(String name) {
        super(name, MEAL_DEFAULT);
    }

    @Override
    public void eat() {
        System.out.println(TYPE_DEFAULT + " " + name + " je " + meal);
    }
}

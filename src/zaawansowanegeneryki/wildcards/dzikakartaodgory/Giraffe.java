package zaawansowanegeneryki.wildcards.dzikakartaodgory;

public class Giraffe extends Animal {

    public static final String MEAL_DEFAULT = "paszę";
    public static final String TYPE_NAME_DEFAULT = "Żyrafa";

    public Giraffe(String name) {
        super(name, MEAL_DEFAULT);
    }

    @Override
    public void eat() {
        System.out.println(TYPE_NAME_DEFAULT + " " + name + " je " + meal);
    }

    @Override
    public void eat(int numberOfMeals) {
        System.out.println("Tu żyrafa, a to jest przeciążenie metody");
        for (int i = 0; i < numberOfMeals; i++) {
            eat();
        }
    }
}


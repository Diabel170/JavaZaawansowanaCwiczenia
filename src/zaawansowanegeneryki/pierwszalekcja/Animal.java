package zaawansowanegeneryki.pierwszalekcja;


//klasa abstrakcyjne: podobna do interfejsu, ale różnice najważniejsze: metody w klasie abstrakcyjnej mogą mieć ciało, mogą być od razu zaimplementowane lub też pól i stanów. ALE NIE MUSZĄ(public abstract void eat();)
//klasa abstrakcyjna - nie może być zainstancjonowana
//rzadsze są klasy abstrakcyjne. Używa się ich, gdy trzeba fallback - możliwość wykonania metody, na klasie która niekoniecznie miała zapewniać te funkcjonalność(np.  ktoreś ze zwierząt
//ma cechę, której inne nie mają. Niestety segregacja interfejsów zmusza nas to zrzucenia odpowiedzialności na wszystkie zwierzęta(np. interfejs "daje" metody, które nigdy nie zostaną użyte).
public abstract class Animal implements Feedable {
    public String name = "";
    public String meal = "";

    public Animal(String name, String meal) {
        this.name = name;
        this.meal = meal;
    }

    @Override
    public void eat() {
        System.out.println("Mniam");
    }

    public void eat(int numberOfMeals) { //ten eat przeciąża tego wyżej; sygnatura - definicja jest inna. Sygnatura to od nazwy metody w prawo. Gdyby zrobić public int eat(){} to by było zakleszczenie nazw
        for (int i = 0; i < numberOfMeals; i++) {
            eat(); //używa eat z wyżej - dzięki przeciążeniu możemy wywołać eat o tej samej nazwie, które odwoła się do eatu wyżej.
        }


    }
}




/*
    mogą zawierać metody abstrakcyjne, czyli takie, które nie posiadają implementacji (ani nawet nawiasów klamrowych)

    może zawierać stałe (zmienne oznaczone jako public static final)

    mogą zawierać zwykłe metody, które niosą jakąś funkcjonalność, a klasy rozszerzające mogą ją bez problemu dziedziczyć

    klasy rozszerzające klasę abstrakcyjną muszą stworzyć implementację dla metod oznaczonych jako abstrakcyjne w klasie abstrakcyjnej

    metod abstrakcyjnych nie można oznaczać jako statyczne (nie posiadają implementacji)

    podobnie jak w przypadku interfejsów nie da się tworzyć instancji klas abstrakcyjnych

Jaka jest więc przewaga klas abstrakcyjnych nad interfejsami, skoro na pierwszy rzut oka nie widać praktycznie żadnych różnic?
Przede wszystkim tutaj możemy już umieścić jakąś implementację, natomiast klasy rozszerzające będą miały jedynie obowiązek rozbudować funkcjonalność poprzez zaimplementowanie metod abstrakcyjnych.*/
package polimorfizm.polimorfizmstatyczny;

//interface jest kontraktem - służy by zapewnić funkcjonalność, ale nie może wskazywać jak to wykonać
//wydzielony zestaw metod
//nie możemy tu wprowadzić stanu, bo nie jest instancją tak jak klasa abstrakcyjna jest elementem klasy końcowej. To szablony klasy.
//możemy rozszerzyć o wiele interfaców, ale rozszerzyć tylko o jedną klasę - jeżeli dwie klasy miałyby te same metody, to niewiadomo, z której byśmy mieli wziąć te metody - "problem diamentowy".
public interface Feedable {
    public void eat();
}

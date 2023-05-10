package lambdy.lambdaPrawdziwaBezARGBezWYN;

public class Main {
    //NASZA PIERWSZA LAMBDA
    public static void main(String[] args) {
        String amazingHello = "Interface Hello! Amazing!"; //ten string powinien być final
        hello("Lambdy", () -> System.out.println(amazingHello)); //ŻEBY KOMPILATOR WIEDZIAŁ CO SIĘ DZIEJE, MUSI BYĆ JAKIŚ IDENTYFIKATOR SKŁADNIKA JĘZYKA
            }                                                                     //() -> System.out.println("Interface Hello! Amazing!") - to wywołanie jest bezpośrednim nawiązaniem do argumentu helloable
                                                                                  // () - to jest bezargumentowe przecież - sayHello. -> - ta funkcja prowadzi do ...
    //My potrzebujemy kontekstu, w którym znajdujemy się w momencie przekazywania tego wgłąb - domknięcie
    //robiąc lambde mamy blok kodu, który może mieć w pamięci miejsce przechowujące stan kontekstu, w którym jest wykonanywane, tu jest on poszerzony o zmienną amazingHello
//TAKA LAMBDA PRZYDA SIĘ DO WYKONANIA RZECZY BEZKONTEKSTOWO.
        /* sayHello – można usunąć, bo przecież w interfacie jest tylko ta metoda
typ zwracany – tutaj void – też może być domniemany po tej jednej metodzie
A parametr do tej metody jest Helloable – jeden.
Public jest niepotrzebne – w interface zawsze jest public – i traktujemy to jako klasę wewnętrzną.
Helloable można wywnioskować po liście argumentów metody hello.
*/



    public static void hello(String s, Helloable helloable) {
        System.out.println(s);
        helloable.sayHello();//na helloable możemy wykonywać instrukcje, to wykona się on na obiekcie, który podamy w na górze w hello / sayHello jest bezargumentowe
        //POZWALA TO NAM NA DELEGACYJNY MODEL OBSŁUGI ZDARZEŃ - ODDELEGOWAĆ ZDARZENIE LUB JAKĄŚ AKCJĘ DO INNEGO MIEJSCA W KODZIE, KTÓRY ZADECYDUJE CO Z NIĄ WYKONA, ALE NIE JAK //sayHello odelogwujemy jej wykonanie

    }
}

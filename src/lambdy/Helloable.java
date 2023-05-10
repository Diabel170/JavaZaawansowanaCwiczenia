package lambdy;
//INTERFACE FUNKCYJNY - POSIADA TYLKO JEDNĄ METODĘ
//INTERFACE - ZAPEWNIAJĄ WYKONANIE PEWNEJ FUNKCJONALNOŚCI, NIE MÓWIĄ W JAKI SPOSÓB - MA BYĆ MOŻLIWA DO WYKONANIA. POTEM WYMUSZAJĄ NA OSOBIE IMPL. BY TAK ZROBIŁA PROGRAM BY WYKONYWAŁ WSKAZANĄ PRZEZ INTER FUNKCJONALNOŚĆ
//MOŻE POMIJAĆ FUNKCJONALNOŚĆ - MOŻNA PRZEKAZAĆ PUSTY KOD
//INTERFACE ZNACZNIKOWY - NIE MA ŻADNEJ METODY ABSTRAKCYJNEJ

@FunctionalInterface //znacznik, jest to interface z @interface - jest adnotacją, on jest czasu wykonania - przechowywany na czas pracy programu.
                    //informujemy, że jest funkcyjny, jest tylko jedna metoda - używamy go do lambd!
public interface Helloable {

    public void sayHello();

    public static void withBody(){
        System.out.println(""); //metody z ciałem - te statyczne - nie mają związku z tym ile metod abstrakcyjnych ma interfejs; ta metoda odnosi sie do klasy, a nie do interfacu


        //INTERFACY ZNACZNIKOWE, JAK NP. SERIALIZABLE, SŁUŻA DO WSKAZANIA, ŻE DANA KLASA JEST ABLE, MOŻLIWA DO WYKONANIA CZEGOŚ. NIE ZAMIENIAMY BLOKU KODU, TYLKO WARTOŚĆ

    }

}

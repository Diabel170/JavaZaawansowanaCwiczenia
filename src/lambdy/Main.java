package lambdy;

public class Main {
    //NASZA PIERWSZA LAMBDA
    public static void main(String[] args) {
        hello("Lambdy", new Helloable() {  // new Helloable to już obiekt; klasa anonimowa - definiowana bezpośrednio w metodzie, bez tworzenie pliku z jej klasy
            @Override
            public void sayHello() { //wykonujemy metode interface hello amazing za pomocą referencji sayHello; przekazujemy obiekt, w którym mówimy jak ma wykonać się metodę
                System.out.println("Interface Hello! Amazing!");
            }
        }); //pseudokod, ale gdybyśmy chcieli żeby te hello wykonywało jakąś akcję to tak by to wyglądało; albo przekazujemy wartości - referencje albo akcje - funkcje


//NOWA KLASA ANONIMOWA, KTÓRA ROZSZERZA INTERFACE HELLOABLE IMPLEMENTUJĄC METODĘ sayHello


//        button.setOnClickListener((v)->{
//
//        }) //struktura: przekazujemy do metody, tak jak zmienną, akcję i blok {} wywoła się kiedy logika button będzie tego potrzebować
    }


    public static void hello(String s, Helloable helloable) {
        System.out.println(s);
        helloable.sayHello();//na helloable możemy wykonywać instrukcje, to wykona się on na obiekcie, który podamy w na górze w hello
        //POZWALA TO NAM NA DELEGACYJNY MODEL OBSŁUGI ZDARZEŃ - ODDELEGOWAĆ ZDARZENIE LUB JAKĄŚ AKCJĘ DO INNEGO MIEJSCA W KODZIE, KTÓRY ZADECYDUJE CO Z NIĄ WYKONA, ALE NIE JAK

    }
}

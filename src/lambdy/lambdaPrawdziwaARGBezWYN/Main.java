package lambdy.lambdaPrawdziwaARGBezWYN;

public class Main {

    public static void main(String[] args) {
        init("Super Lambdy", i -> { //Klamry są niepotrzebne, ale lepiej to póki co zostawić, dla celów naukowych; argument jest jeden - można bez () JEST TO WYJĄTEK JEDNOARGUMENTOWYCH
            for (int j = 0; j < i; j++) {
                System.out.println(j);
            }

        });

    }


    public static void init(String s, Initialable initialable) {
        System.out.println(s);
        initialable.init(10); //TUTAJ TRZEBA PRZEKAZAĆ PARAMETR
    }
}

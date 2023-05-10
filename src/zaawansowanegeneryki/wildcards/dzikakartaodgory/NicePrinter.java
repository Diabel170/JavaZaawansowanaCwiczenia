package zaawansowanegeneryki.wildcards.dzikakartaodgory;

public class NicePrinter<T> implements FavouriteNumber<T> {


    @Override
    public void printFavouriteNumber(T t) {
        System.out.println("Bardzo lubię " + t);
    }

    public <T> boolean isDifferent(T t1, T t2) { //T JEST JAKĄŚ KLASĄ - CZYLI ROZSZERZA OBJECT
        return !t1.equals(t2);
    }
}


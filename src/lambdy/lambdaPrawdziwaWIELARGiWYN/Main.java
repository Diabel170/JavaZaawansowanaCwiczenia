package lambdy.lambdaPrawdziwaWIELARGiWYN;

public class Main {

    public static void main(String[] args) {

        System.out.println(sum("Świetne Lambdy", (i, j) -> i + j)); //może być zastąpiona przez funkcje, która jest referencją na metodzie
    }
public static Integer sum(String s, KingSumable kingSumable){
        System.out.println(s);
        return kingSumable.sum(2, 3);

    }
}

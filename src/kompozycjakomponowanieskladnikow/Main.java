package kompozycjakomponowanieskladnikow;

public class Main {
    public static void main(String[] args) {

        Person piotr = new Person("Piotr", 33);
        Employee panPiotr = new Employee(piotr, 30000, "Junior developer");

        System.out.println(panPiotr.getName());
    }
}

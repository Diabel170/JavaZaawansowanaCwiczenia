package kompozycjakomponowanieskladnikow;

public class Employee {
    private Person person;
    private Integer salary;
   private String title;

    public Employee(Person person, Integer salary, String title) { //EMPLOYEE MA PERSON, NIE JEST PERSON
        this.person = person;
        this.salary = salary;
        this.title = title;

    }
    public String getName(){
        return person.name;
    }

    public Integer getSalary() {
        return salary;
    }

    public String getTitle() {
        return title;
    }
}

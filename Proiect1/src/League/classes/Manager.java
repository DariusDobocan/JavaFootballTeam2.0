package League.classes;

public class Manager extends Angajat {

    private int salary;

    public Manager(String nume, String prenume, int varsta, int salary, int e)
    {
        super(nume,prenume,varsta);

        this.salary = salary + (10 * e);
    }

    public String afis(){

        return "Manager: "+ nume + " " + prenume + " " + varsta + " de ani si salar:" + salary +"$ " + "\n";
    }
}

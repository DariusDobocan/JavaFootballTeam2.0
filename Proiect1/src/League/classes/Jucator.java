package League.classes;

public class Jucator extends Angajat {

    public int goluri;

    public String poz;

    private int salary;

    public Jucator(String nume, String prenume, int varsta, int goluri, String poz, int salary){
        super(nume,prenume,varsta);

        this.goluri = goluri;
        this.poz = poz;
        this.salary = salary + (50 * this.goluri);
    }

    public String afis(){

        return "Jucator: "+ nume + " " + prenume + " " + varsta + " de ani si salar " + salary + "$"+ "\n";
    }
}
